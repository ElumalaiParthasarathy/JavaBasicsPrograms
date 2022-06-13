package com.string;

public class StringQuestionsMethods {

	public void checkWordIsEqual(String a , String b) {
		boolean check = a.equals(b);
		if (check == true) {
			System.out.println("The both are same ");
		}
		else {
			System.out.println("Both are not same");
		}

	}
	public void checkWordIsEqualsIgnoreCase(String a , String b) {
		boolean check = a.equalsIgnoreCase(b);
		if (check == true) {
			System.out.println("The both are same ");
		}
		else {
			System.out.println("Both are not same");
		}

	}
	public boolean  isValidEmail(String mailId) {
		boolean isMail =  mailId.contains("@");
		return isMail;
	}
	public void isValidAddress(String address) {
		boolean isAddress = address.contains("pincode");
		if(isAddress == true) {
			System.out.println("Valid address");
		}else {
			System.out.println("invalid address");
		}
	}
	public void isValidPhoneNumber(String number) {
		int a[] = new int[number.length()];
		int flag []= new int[number.length()];
		int sum = 0;


		for(int i =0; i<number.length();i++) {
			a[i]=number.charAt(i);
		}
		for(int j=0; j<a.length;j++) {
			if(a[j]>=48 && a[j]<=57) {
				flag [j] = 1;
			}
			else {
				flag [j]= 0;
			}
		}
		for (int k =0; k<flag.length;k++) {
			sum+=flag[k];
		}
		//System.out.println(sum);
		if(sum==10) {
			System.out.println("Valid Phone Number");
		}
		else if(sum>10) {
			System.out.println("Please check digits or alpha numeric");
		}
		else {
			System.out.println("Invalid Phone Number. Please enter number Only");
		}			
	}
	//counts the different type characters in string
	public void countType(String string) {
		int upperCase = 0;
		int lowerCase = 0;
		int number=0;
		int special=0;
		for(int i =0;i<string.length();i++) {

			if(string.charAt(i)>=65 && string.charAt(i)<=90) {
				upperCase++;
			}
			else if(string.charAt(i)>=97 && string.charAt(i)<=122) {
				lowerCase++;
			}
			else if(string.charAt(i)>=48 && string.charAt(i)<=57) {
				number++;
			}
			else {
				special++;
			}



		}
		System.out.println("Upper case in string : "+upperCase);
		System.out.println("Lower case in string : "+lowerCase); 
		System.out.println("Numeric in string : "+number);
		System.out.println("Special Character in string : "+special);
	}

	public void countVowels(String s) {


		int vowels = 0;
		int total = s.length();
		String low = s.toLowerCase();

		for(int i =0;i<s.length();i++) {
			char a= low.charAt(i);
			if (a == 'a'|| a == 'e'|| a == 'i'|| a == 'o' || a=='u') {
				vowels++;
			}
		}
		System.out.println("Vowels in string : "+vowels+"\nconsonant is string : "+(total-vowels));

	}
}
