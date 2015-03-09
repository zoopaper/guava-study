package org.guava.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;

public class SplitterTest {

	public static void main(String[] args) {
		Iterable<String> names = Splitter.on('|').split("shi|jin|gui");
		Iterator iter = names.iterator();
		while (iter.hasNext()) {
			String s = (String) iter.next();
			// System.out.println(s);
		}
		splitMap();
	}

	public static void splitMap() {

		String mapStr = "Washington D.C=Redskins#New YorkCity=Giants#Philadelphia=Eagles#Dallas=Cowboys";
		Splitter.MapSplitter mapSpliter = Splitter.on("#").withKeyValueSeparator("=");
		Map m = mapSpliter.split(mapStr);
		System.out.println(m);
	}
}
