package org.guava.study;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

public class JoinerTest {

	public static void main(String[] args) throws IOException {
		List<String> strs = new ArrayList<String>();
		strs.add("name");
		strs.add("age");

		String s=new JoinerTest().buildString(strs, ",");
		System.out.println(s);
		System.out.println("-----------------------------------------");
		joiner();
		joinToFile();
		testMapJoiner();
	}

	public String buildString(List<String> sList, String delimiter) {
		
		Preconditions.checkArgument(sList.size()>0," list size is less than 0");
		
		StringBuilder sb = new StringBuilder();
		for (String s : sList) {
			sb.append(s).append(delimiter);
		}
		sb.setLength(sb.length() - delimiter.length());

		return sb.toString();
	}
	
	
	public static void joiner(){
		List<String> strs = new ArrayList<String>();
		strs.add("name");
		strs.add("age");
		strs.add("sex");
		strs.add("address");
		
		String newStr = Joiner.on("|").useForNull("no value").join(strs);
		String testStr = Joiner.on("-").useForNull("no value").join("aaa",null);
		
		System.out.println(testStr);
	}
	
	public static void joinToFile() throws IOException{
			FileWriter fw =new FileWriter(new File("e:/join.txt"));
			List<String> strs = new ArrayList<String>();
			strs.add("name");
			strs.add("age");
			strs.add("sex");
			strs.add("address");
			Joiner j =Joiner.on("#");
	}
	
	public static void testMapJoiner(){
		Map<String,String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C","Redskins");
		testMap.put("New York City","Giants");
		testMap.put("Philadelphia","Eagles");
		testMap.put("Dallas","Cowboys");
		
		MapJoiner mapJoiner  = Joiner.on("#").withKeyValueSeparator("=");
		String retStr = mapJoiner.join(testMap);
		System.out.println(retStr);
		
	}
}
