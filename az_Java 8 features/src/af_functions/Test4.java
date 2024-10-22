
//Program to find total monthly salary of all the employees

package af_functions;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		Function<ArrayList<Employee>, Double> f = emp->{  
			double totalSalary = 0;
			for (Employee e : l) {
				totalSalary = totalSalary+e.salary;
			}
			return totalSalary;
		};
		System.out.println("Total Salary to be paid: "+f.apply(l));
	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Bunny",1000));
		l.add(new Employee("Chinny",2000));
		l.add(new Employee("Dinny",3000));
		l.add(new Employee("Ginny",4000));
	}

}
