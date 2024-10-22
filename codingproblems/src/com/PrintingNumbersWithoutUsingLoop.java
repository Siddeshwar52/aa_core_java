package com;

public class PrintingNumbersWithoutUsingLoop {

	public static void main(String[] args) {
		printNos(1);
	}

	private static void printNos(int n) {
		if (n < 100) {
			System.out.println(n);
			printNos(n + 1);
		}
	}
}
