
// To calculate Monthly salary with employee and time sheet object as input by using ByFunction

package ai_biFunctionalinterface;

import java.util.function.BiFunction;

class Employee{
	
	int eno;
	String name;
	double dailywage;
	
	Employee(int eno, String name, double dailywage) {
		this.eno = eno;
		this.name = name;
		this.dailywage = dailywage;
	}
}

class TimeSheet{
	
	int eno;
	int days;
	
	TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		
		BiFunction<Employee, TimeSheet, Double> f = (e,t)->e.dailywage*t.days;
		Employee e = new Employee(101, "Durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		
		System.out.println("Employee Monthly Salary: "+f.apply(e, t));
	}
}
