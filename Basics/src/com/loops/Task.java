package com.loops;

public class Task {

	public static void main(String[] args) {
		
		for(int i =1; i<=25;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
			
	for(int i =1; i<=25;i++) {
		if(i==12 || i==21) {
			continue;
		}
		System.out.print(i+" ");	
		}
	
	System.out.println();

	for(int i =1; i<=25;i++) {
		if(i==18) {
			break;
		}
		System.out.print(i+" ");
	}
}
}
		
	


