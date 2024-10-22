package com;

public class Examples {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Denominator");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out  OfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Super");
		}
	}

}
