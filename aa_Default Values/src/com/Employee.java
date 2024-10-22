package com;

public class Employee {
	int id;
	String name;
	double salary;
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.id = 100;
		e2.name = "Siddu";
		e3.salary = 700.00;
		
		System.out.println(e1.id);
		System.out.println(e2.name);
		System.out.println(e3.salary);
	}

}


