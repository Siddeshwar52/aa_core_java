
package com;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Age");
		int age = s.nextInt();
		
		System.out.println("Enter Name");
		String name = s.next();
		
		System.out.println("Enter Salary");
		double salary = s.nextDouble();
		
		System.out.println("---------------");
		
		System.out.println(" Age:"+age+"\n Name:"+name+"\n Salary:"+salary);
		
		s.close();
	}

}
