package com;

public class Solution {

	// Method without Arguments and without return statement
	public void m1(){
		System.out.println("Learning Methods");
	}

	// Method with Arguments and without return statement
	public void m2(String name, int age){
		System.out.println("Name "+name+" Age "+age);
	}

	// Method without Arguments and with return statement
	public String m3(){
		return"Tech M";
	}

	// Method with Arguments and with return statement
	public int m4(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		s.m1();
		System.out.println("---------");

		s.m2("john" , 25);
		System.out.println("---------");

		String company =  s.m3();
		System.out.println(company);

		System.out.println(s.m3());

		System.out.println("---------");

		int sum = s.m4(4,5);
		System.out.println(sum);
		System.out.println(s.m4(4,5));

		System.out.println("---------");

	}
}
