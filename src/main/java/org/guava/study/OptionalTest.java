package org.guava.study;

import com.google.common.base.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String s = "Hello";
		Optional op = Optional.of(s);
		Optional a = Optional.absent();

		if (op.isPresent()) {
			System.out.println(op.get());
		}

	}

}
