package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();

		System.out.println(a+b);
		
		scan.close();
		
		System.out.println("End");
		
		
	}

}
