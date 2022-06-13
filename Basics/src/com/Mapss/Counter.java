package com.Mapss;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Counter {
	
	
	public static void main(String[] args) {
		Map<Integer,Integer> map =new  Hashtable<Integer, Integer>();
		Map<Integer,Integer> map2 =new  HashMap<Integer, Integer>();

		map.put(10, 15);
		map2.put(10, 15);
		System.out.println(map);
		System.out.println(map2);
	int s =	map.get(10)+map2.get(10);
		
		  System.out.println(s);
	
	}
}
    