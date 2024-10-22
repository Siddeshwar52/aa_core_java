
//Demo Program to increment employee salary by using Bi consumer

package ai_biFunctionalinterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees{
	
	String name;
	double salary;
	
	Employees(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Test4 {
	
	public static void main(String[] args) {
		
		ArrayList<Employees> l = new ArrayList<>();
		l.addAll(Stream.of(new Employees("Durga", 1000),new Employees("Sunny", 2000), 
				               new Employees("Bunny", 3000), new Employees("Chinny", 4000)).collect(Collectors.toList()));
		
		BiConsumer<Employees , Double> c = (e,d)->e.salary=e.salary+d;
		
		for (Employees e : l) {
			c.accept(e, 500.00);
		}
		
		for (Employees e : l) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee Salary: "+e.salary);
			System.out.println();
		}
	}
}
