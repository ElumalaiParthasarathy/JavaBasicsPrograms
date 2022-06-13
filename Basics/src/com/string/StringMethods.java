package com.string;

public class StringMethods {

	public static void main(String[] args) {

		String a = "GreensTechnology";
		String b = "SeleniumAutomationtool";
		String c =  "elumalai";
		String d =  "j a v a p r o g r a m";
		String e =  "9095484678";
		
		
		System.out.println(a.length()+"\n"+b.length()+"\n"+c.length()+"\n"+d.length()+"\n"+e.length());
		int lastIndexOf = a.lastIndexOf("o");
		System.out.println("last index of o in "+ a + " is "+lastIndexOf);	
		int indexOf = b.indexOf("o");
		System.out.println("index of o in "+ b +" is "+indexOf);	
		int indexOfC = c.indexOf("i");
		System.out.println("index of i in "+c+" is "+indexOfC);	
		int lastIndexOfD = d.lastIndexOf(" ");
		System.out.println("index of  in "+ d +" is "+lastIndexOfD);	
		int indexOfE = e.indexOf("8");
		System.out.println("index of  8 "+ e +" is "+indexOfE);
		
		
		
		
	}

}
