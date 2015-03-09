package org.guava.study;

import com.google.common.base.Strings;

public class StringsTest {

	public static void main(String[] args) {
		String s = "jin";
		String newStr = Strings.padStart(s, 8, 'a');
		String newStr2 = Strings.padEnd(s, 5, 'd');
		System.out.println(newStr2);

		String nul = Strings.emptyToNull("");
		String zeroStr = Strings.nullToEmpty(null);
		System.out.println(zeroStr);
		boolean check = Strings.isNullOrEmpty(null);
		System.out.println(check);

		String a = "敏感新闻发布量前10的网络媒体";
		String b = "敏感新闻发布量前10的网络媒�?amp;=";
		b = b.substring(0, b.length() - 7);
		System.out.println(b);

		if (a.indexOf(b) != -1) {
			System.out.println(a);
		}

	}
}
