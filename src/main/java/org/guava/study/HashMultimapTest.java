package org.guava.study;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class HashMultimapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Bar", "1");
		map.put("Bar", "2");
		map.put("Bar", "3");
		map.put("Bar", "4");
		map.put("Bar", "5");
		System.out.println("HasmMap集合大小：" + map.size());

		Multimap<String, String> multiMap = HashMultimap.create();
		
		multiMap.put("Bar", "1");
		multiMap.put("Bar", "2");
		multiMap.put("Bar", "3");
		multiMap.put("Bar", "3");
		multiMap.put("Bar", "3");
		System.out.println("HashMultimap集合大小："+multiMap.size());
		
	}

}
