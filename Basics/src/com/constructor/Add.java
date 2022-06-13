package com.constructor;

public class Add {
	
	public  Add () {
		this(5,5);
		System.out.println("Completed");
	}
	public  Add (int a, int b) {
		System.out.println("Adding two given numbers :"+(a+b));
		System.out.println("Subtracting two given numbers : "+(a-b));
	}


public static void main(String[] args) {
	Add  add =  new Add();
}}


