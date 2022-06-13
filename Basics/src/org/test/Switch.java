package org.test;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the No of the weekday :");
		int n = scanner.nextInt();

		if (n>7) {
			System.out.println("Invalid Number");
		}

		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Funday");
			break;
			}
		scanner.close();
	}
}


