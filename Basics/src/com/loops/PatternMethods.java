package com.loops;

public class PatternMethods {



	public void problem1(int n ) {								//problem 1

		for(int i = 1; i<=n;i++) {							

			for (int j=1; j<=n; j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		System.out.println("");
	}

	public void problem2(int n) {

		for (int k = 1; k<=n;k++) {							//problem 2

			for(int l = 1; l<=n;l++) {
				System.out.print(" "+k+" ");
			}
			System.out.println();
		}

		System.out.println("");
	}
	public void problem3(int a) {

		for(int m = a; m>0; m--) {							//problem 3

			for(int n=a;n>0;n--) {
				System.out.print(" "+m+" ");
			}
			System.out.println("");
		}

		System.out.println("");
	}
	public void problem4(int n) {


		for(int o=n;o>0; o--) { 							//problem 4

			for(int p = n; p>0;p--) {
				System.out.print(" "+p+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void problem5(int n) {

		for (int i = n; i>=0; i--) {
			for(int j= 1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}
	public void problem6(int n) {

		for (int i = 0; i<=n; i++) {

			for (int j =n; j>i; j--) {
				System.out.print(" "+j+" ");

			}
			System.out.println();
		} 
	}
	public void problem7(int n) {

		for (int i = n; i>0; i--) {

			for (int j = n; j >=i; j--) {
				System.out.print(" "+j+" ");

			}
			System.out.println();
		}


	}
}
