package com.Mapss;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
	public static void main(String[] args) {
		int hashKey =  5639;
		
		Map<Integer,String> mapA = new LinkedHashMap<>();
		
		mapA.put(hashKey, "Elumalai");
		mapA.put(hashKey++, "Goms");
		mapA.put(hashKey++, "Vicky");
		mapA.put(hashKey++, "Shavithan");
		mapA.put(hashKey++, "Gokul");
		
		System.out.println(mapA);
		
		Map<Integer,String> mapB = new TreeMap<>();
		
		mapB.put(2, "Henry");
		mapB.put(3, "Mahima");
		mapB.put(1, "Rani");
		mapB.put(0, "samantha");
		
		System.out.println("THIS IS TREE MAP : \n"+mapB);
		
		Map<Character, Integer> mapC =  new Hashtable<Character, Integer>();
		
		mapC.put('a', 1);
		mapC.put('b', 2);
		mapC.put('c', 3);
		mapC.put('d', 4);
		mapC.put('e', 5);
		
		System.out.println(mapC);
		
	}
	
}
