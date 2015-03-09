package org.guava.study;

import java.util.Iterator;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

public class FluentIterableTest {

	List<Person> personList;

	public static void main(String[] args) {

		FluentIterableTest ft =new FluentIterableTest();
		ft.setup();
		ft.filter();
	}

	public void setup() {
		Person p1 = new Person("ZhagnSan", 2, 'F');
		Person p2 = new Person("LiSi", 44, 'F');
		Person p3 = new Person("WangWu", 4, 'F');
		Person p4 = new Person("XiaoMing",12, 'M');
		personList = Lists.newArrayList(p1, p2, p3, p4);
	}

	public void filter() {
		FluentIterable<Person>  filterPersonByAge = FluentIterable.from(personList).filter(new Predicate<Person>() {
			public boolean apply(Person input) {
				boolean ret=input.getAge()>31;
				return ret;
			}
		});
		
		Iterator<Person> iter =filterPersonByAge.iterator();
		while(iter.hasNext()){
			Person p =iter.next();
			System.out.println(p.toString());
		}
		
	}
}
