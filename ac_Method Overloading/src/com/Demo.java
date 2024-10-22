package com;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		main(10);
		main(12.45);
		System.out.println("Bye");
	}
	
	public static void main(int a) {
		System.out.println("a:"+a);
		
	}
	
	public static void main(double b) {
		System.out.println("b:"+b);
		
	}

}
