package org.guava.study;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Ordering;

public class OrderingTest {

	public static void main(String[] args) {
		List str = new ArrayList();
		str.add("yyy");
		str.add("ccc");
		Ordering order = Ordering.natural();
		int val = order.binarySearch(str, "ccc");
		System.out.println(val);

	}

}
