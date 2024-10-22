
//Primitive type of Consumer Interface

package aj_primitivetypefunctionalinterface;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Demo Program to increment employee salary by using ObjDoubleConsumer

class Employe{

	String name;
	double salary;

	Employe(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Test3 {

	public static void main(String[] args) {

		ArrayList<Employe> l = new ArrayList<>();
		l.addAll(Stream.of(new Employe("Durga", 1000),new Employe("Sunny", 2000), 
				new Employe("Bunny", 3000), new Employe("Chinny", 4000)).collect(Collectors.toList()));

		ObjDoubleConsumer<Employe> c=(e,d)->e.salary=e.salary+d;

		for (Employe e : l) {
			c.accept(e, 500.00);
		}
		for (Employe e : l) {
			System.out.println("Employee Name: "+e.name);
			System.out.println("Employee Salary: "+e.salary);
			System.out.println();
		}
	}
}
