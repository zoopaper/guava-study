package org.guava.study;

import java.util.TreeMap;

import com.google.common.base.Preconditions;

public class PreconditionsTest {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		String strVal = null;
		
		// Preconditions.checkArgument(1>4);
		// Preconditions.checkArgument(1 > 2,
		// "one is wheater greater  than two ?");


		TreeMap tmp = Preconditions.checkNotNull(tm);
		
		System.out.println(tmp);
	}

}
