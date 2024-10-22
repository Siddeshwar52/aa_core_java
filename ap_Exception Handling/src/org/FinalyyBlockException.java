package org;

public class FinalyyBlockException {

	public static void main(String[] args) {

		System.out.println("Start");

		try 
		{
			System.out.println(10/0);
		}

		catch(ArithmeticException e) 
		{
			System.out.println("Invalid Denominator");
		}
		finally 
		{
			System.out.println("Inside finally block");
		}

		System.out.println("End");

	}

}
