package org;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		
		System.out.println("Employee Id: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee salary: "+this.salary);
		System.out.println("----------------");
		
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "ding1" , 500.88);
		Employee e2 = new Employee(102, "binga" , 600.88);
		Employee e3 = new Employee(0, null , 600.88);
		
//		System.out.println("Employee Id: "+e1.id);
//		System.out.println("Employee Name: "+e1.name);
//		System.out.println("Employee salary: "+e1.salary);
//		
//		System.out.println("Employee Id: "+e2.id);
//		System.out.println("Employee Name: "+e2.name);
//		System.out.println("Employee salary: "+e2.salary);
//		
//		System.out.println("Employee Id: "+e3.id);
//		System.out.println("Employee Name: "+e3.name);
//		System.out.println("Employee salary: "+e3.salary);
		
		e1.display();
		e2.display();
		e3.display();
	}

}
