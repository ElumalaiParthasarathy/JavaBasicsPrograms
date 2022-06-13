package com.loops;

public class StarPattern {
	public void starPatternPrint(int n) {
		for(int i = 1;i<=n;i++) {
			for ( int j = n; j>=i;j--) {
				System.out.print(" ");
			}
			for ( int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		StarPattern pattern = new StarPattern();
		pattern.starPatternPrint(5);
		
	}

}
