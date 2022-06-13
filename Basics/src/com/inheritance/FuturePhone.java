package com.inheritance;

public class FuturePhone extends SmartPhone {
	
	//multilevel inheritance
	
	public void hologramCall() {
		System.out.println("we can make an hologram call in future phone which will be upgraded from smart phone");
	}
	public void connectivity() {
		System.out.println("Connectivity is on 5G in future phone which will be upgraded from smart phone");
	}

	public static void main(String[] args) {
		
		FuturePhone futurePhone = new FuturePhone(); 
		futurePhone.call();
		futurePhone.message();
		System.out.println("\n");
		futurePhone.videoCall();
		futurePhone.entertainment();
		System.out.println("\n");
		futurePhone.hologramCall();
		futurePhone.connectivity();
		
	}

}
