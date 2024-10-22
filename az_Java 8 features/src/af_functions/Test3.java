
// Program to find Student Grade whose marks are greater than 60

package af_functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Students{
	String name;
	int marks;

	Students(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class Test3 {

	public static void main(String[] args) {

		ArrayList<Students> l = new ArrayList<Students>();
		populate(l);
		Function<Students,String> f = s->{
			int marks=s.marks;
			return (marks>=80)?"A[Distinction]":(marks>=60)?"B[First Class]":
				(marks>=50)?"C[Second Class]":(marks>=35)?"D[Third Class]":"E[Failed]";
		};

		Predicate<Students> p = s->s.marks>60;

		for(Students s : l) {
			if(p.test(s)) {
				System.out.println("Student Name: "+s.name);
				System.out.println("Student Marks: "+s.marks);
				System.out.println("Student Grade: "+f.apply(s));
				System.out.println();
			}
		}
	}

	private static void populate(ArrayList<Students> l) {
		l.add(new Students("Sunny",100));
		l.add(new Students("Bunny",65));
		l.add(new Students("Chinny",55));
		l.add(new Students("Vinny",45));
		l.add(new Students("Pinny",25));
	}

}