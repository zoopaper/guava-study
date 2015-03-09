package org.guava.study;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * @author krisjin
 * @date 2015-3-9
 */
public class ArrayListMultimapTest {

	public static void main(String[] args) {
		Multimap<String, String> listMap = ArrayListMultimap.create();

		listMap.put("张三", "朝阳门地址");
		listMap.put("张三", "建国门地址");
		listMap.put("张三", "西红门地址");

		System.out.println("初始集合大小：" + listMap.get("张三"));
		listMap.put("张三", "西便门");
		
		System.out.println("添加数据：" + listMap.get("张三"));
		
		listMap.remove("张三", "朝阳门地址");
		System.out.println("删除数据："+listMap.get("张三"));

	}
}
