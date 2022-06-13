package com.switchexample;

import java.util.Scanner;

public class ArithematicMain {

	public static void main(String[] args) {
		String check;
		int a, b;
		Scanner scanner = new Scanner(System.in);
		ArthimaticOperation arthimaticOperation =  new ArthimaticOperation();
		do {
			System.out.println("Choose the opreation from below : \n add \n sub \n mul \n div \n mod");
			String opreation =scanner.next().toLowerCase();
			
			switch (opreation) {
			case "add":
				System.out.println("Enter the first oprend : ");
				a = scanner.nextInt();
				System.out.println("Enter the second oprend : ");
				b = scanner.nextInt();
				System.out.println("The sum of two numbers is = "+
						arthimaticOperation.add(a, b));
				break;
			case "sub":
				System.out.println("Enter the first oprend : ");
				a = scanner.nextInt();
				System.out.println("Enter the second oprend : ");
				b = scanner.nextInt();
				System.out.println("The difference of two numbers is = "+
						arthimaticOperation.sub(a, b));
				break;
			case "mul":
				System.out.println("Enter the first oprend : ");
				a = scanner.nextInt();
				System.out.println("Enter the second oprend : ");
				b = scanner.nextInt();
				System.out.println("The product of two numbers is = "+
						arthimaticOperation.mul(a, b));			
				break;
			case "div":
				System.out.println("Enter the first oprend : ");
				a = scanner.nextInt();
				System.out.println("Enter the second oprend : ");
				b = scanner.nextInt();
				System.out.println("The quotation is = "+
						arthimaticOperation.div(a, b));			
				break;
			case "mod":
				System.out.println("Enter the first oprend : ");
				a = scanner.nextInt();
				System.out.println("Enter the second oprend : ");
				b = scanner.nextInt();
				System.out.println("The remainder is = "+
						arthimaticOperation.mod(a, b));			
				break;
			default:
				System.out.println("please select appropriate opreation. ");
				break;
			}
			System.out.println("do you want make another calculation : yes or no");
			check = scanner.next();
		}
		while(check.equalsIgnoreCase("yes"));
		System.out.println(" Thank you for using xD");
		scanner.close();
	}

}
