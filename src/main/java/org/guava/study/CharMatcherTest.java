package org.guava.study;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {

	public static void main(String[] args) {
		String tabsAndSpaces = "  String	fsa fdsaf	with spaces and 	tabs  ";
		String lettersAndNumbers = "fasfsd3242dsafd";
		String scrubbed = CharMatcher.WHITESPACE.trimAndCollapseFrom(tabsAndSpaces, ' ');
//		String scrubbed = CharMatcher.WHITESPACE.collapseFrom(tabsAndSpaces, ' ');
		System.out.println(scrubbed);
		
		
		String upperCase = CharMatcher.JAVA_UPPER_CASE.collapseFrom(tabsAndSpaces, ' ');
		CharMatcher mix=CharMatcher.JAVA_LETTER.or(CharMatcher.WHITESPACE);
		
		String retained =CharMatcher.JAVA_DIGIT.removeFrom(lettersAndNumbers);
		String retainedNum = mix.removeFrom("afasfsad234242 fasfsa000");
		
		
		
		System.out.println(retainedNum);
	}

}
