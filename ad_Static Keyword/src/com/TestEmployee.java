package com;

// Accessing static properties in another class

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println(Employee.id);
		Employee.work();
		
		 //System.out.println(id); //Test.id
		 //work(); //Test.work();

	}	
}
