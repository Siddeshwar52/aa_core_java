package com;

public class Person {

//	@Override
//	public String toString() {
//
//		return("hello");
//	}

	public static void main(String[] args) {

		Person p = new Person();              // Object Creation

		System.out.println(p);                // implicitly it calls toString() --> String Representation

		System.out.println(p.toString());    // explicitly calling toString()
		
		Object obj = new Demo();
		Person per =  (Person) obj;
		

	}
}
