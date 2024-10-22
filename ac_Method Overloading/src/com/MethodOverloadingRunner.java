package com;

class MethodOverloading {

	void display() {
		System.out.println("Hello");
	}

	void display(int x) {
		System.out.println(x);
	}

	void display(double x) {
		System.out.println(x);
	}

	void display(int x, String y) {
		System.out.println(x + " " + y);
	}

	void display(String y, int x) {
	}
}

public class MethodOverloadingRunner {

	public static void main(String[] args) {
		MethodOverloading mo1 = new MethodOverloading();
//		mo1.display(45);
//		mo1.display(12, "java");
//		mo1.display(45.65);
//		mo1.display();
//		mo1.display("eclipse", 789);
		mo1.display('c');  //Promotion to next datatype

	}

}
