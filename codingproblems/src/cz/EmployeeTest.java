package cz;

import cz.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

	public static void main(String[] args) {

		List<cz.Employee> emp = Stream.of(new Employee(1, "AA", 10), new Employee(2, "BB", 15),new Employee(3,"CC", 25)).collect(Collectors.toList());

		List<Employee> emp1 = emp.stream().map(e->{

			if(e.getSalary()<=20) {
				e.setSalary(e.getSalary()*1.01);
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println(emp1);
		

	}
}
