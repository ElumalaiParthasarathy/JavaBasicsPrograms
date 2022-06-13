package com.string;

import java.util.Scanner;

public class StringQuestions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StringQuestionsMethods methods = new StringQuestionsMethods();
		System.out.println("Enter the number : ");
		String number = scanner.nextLine();
		methods.isValidPhoneNumber(number);
		scanner.close();
		}
	}


