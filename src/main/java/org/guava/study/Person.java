package org.guava.study;

import com.google.common.base.Objects;

public class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String toString() {
		return Objects.toStringHelper(this).add("name", getName()).add("age", getAge()).add("sex", getSex()).toString();
		
	}
	
	

}
