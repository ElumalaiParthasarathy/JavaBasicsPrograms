package com.loops;

public class Fibonacci {

	public static void main(String[] args) {
		
			
		long a = 0, b = 1, c;
        
        for (int i = 0; i <= 10; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
       
		
	}

}
