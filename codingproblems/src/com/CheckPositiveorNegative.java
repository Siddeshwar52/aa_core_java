package com;

import java.util.Scanner;

public  class CheckPositiveorNegative {

	public static void checkPositiveorNegative(int a) {
		if (a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		for(int i=0; i<=5; i++) {
			System.out.println("Enter the value ");
			int x = s.nextInt();
			checkPositiveorNegative(x);

		}
		s.close();
	}
}
