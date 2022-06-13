package com.list;

import java.util.ArrayList;
import java.util.List;


public class Lista {
//Program To find common  values in List
	public static void main(String[] args) {
		List<Object> n = new ArrayList<Object>();
	 
		n.add("ask");
		n.add(22);
		n.add("This");
		n.add("Samantha");
		n.add("abcde");
		
		List<Object> o = new ArrayList<Object>();
		o.add(20);
		o.add("This");
		o.add("ask");
		o.add("Samantha");
		o.add("asdfg");
	
		List<Object> same = new ArrayList<Object>();
		
		System.out.println(n);
		System.out.println(o);
		
		for(int i = 0; i<n.size(); i ++) {
			
			for(int j = 0 ; j<o.size();j++) {
				if (n.get(i)==o.get(j)) {
					same.add(n.get(i));
				}
			}
			
		}
		System.out.println("common in both list : "+same);
		

	}

}
