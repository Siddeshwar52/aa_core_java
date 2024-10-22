
//Program to find Salary increment

package af_functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Workers{
	String name;
	double salary;

	Workers(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Workers [name=" + name + ", salary=" + salary + "]";
	}
}

public class Test6 {

	public static void main(String[] args) {

		ArrayList<Workers> l = new ArrayList<Workers>();
		populate(l);
		System.out.println("Before Increment: "+l);
		Predicate<Workers> p = w->w.salary<3500;
		Function<Workers, Workers> f = e->{e.salary=e.salary+500;
		return e;
		};
		System.out.println("After Increment: ");
		ArrayList<Workers> l2 = new ArrayList<Workers>();
		for (Workers work : l) {
			if(p.test(work)) {
				l2.add(f.apply(work));
			}
		}
		System.out.println(l);
		System.out.println("Employee with incremented salary: "+l2);
	}

	private static void populate(ArrayList<Workers> l) {

		l.add(new Workers("Bunny",1000));
		l.add(new Workers("Chinny",2000));
		l.add(new Workers("Dinny",3000));
		l.add(new Workers("Ginny",4000));

	}

}
