package com;

public class CallByValue {
	
	int i =10;

	public static void main(String[] args) {

		CallByValue d = new CallByValue();
		
		//Call by value
		System.out.println(d.i);
		m1(10);
		System.out.println(d.i);
		
		//Call by reference
		System.out.println(d.i);
		d.m2(d);
		System.out.println(d.i);

	}

	private static void m1(int i) {
		i = i+10;
	}

	private static void m2(CallByValue d){  
		d.i=d.i+100;                  //changes will be in the instance variable  
	} 
}

//There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. 
//The changes being done in the called method, is not affected in the calling method