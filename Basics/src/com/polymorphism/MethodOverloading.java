package com.polymorphism;

public class MethodOverloading {
	
	
	
	public void card(String string ) {
		System.out.println("the first card is " +string);
	}
	public void card(int num, String string) {
		System.out.println("Second card is "+num+" of "+string);
	}


	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.card("joker");
		methodOverloading.card(5, "Hearts");
		
	}

}
