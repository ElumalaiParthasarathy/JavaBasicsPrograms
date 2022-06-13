package com.array;

public class ArrayPrograms {
	
			public static void main(String[] args) {
				
				
			int	a [] = {1,2,3,4,5,6,7,8,9,10};
			int sum = 0;
			int average  ;
			
			
			for(int i = 0 ; i<a.length;i++) {
				
				sum+=a[i];
			
			}
			
			average = sum/a.length;
				System.out.println("The sum of array values : "+sum);
				System.out.println("The average of array is : "+ average);
			}
			
			

}
