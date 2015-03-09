package org.guava.study;

import com.google.common.base.Objects;

public class ObjectsTest {

	public static void main(String[] args) {
		if (Objects.equal("aa", "a")) {
			System.out.println("===");
		}
		
		int hashCode = Objects.hashCode("name",28);
		System.out.println(hashCode);
		
		String  a =Objects.firstNonNull("e", "ddd");
		System.out.println(a);
		
	}

}
