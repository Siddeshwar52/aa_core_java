
// Program to find Student Grade 

package af_functions;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class Test2 {

	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);
		Function<Student,String> f = s->{
			int marks=s.marks;
			return (marks>=80)?"A[Distinction]":(marks>=60)?"B[First Class]":
				    (marks>=50)?"C[Second Class]":(marks>=35)?"D[Third Class]":"E[Failed]";
		};

		for(Student s : l) {
			System.out.println("Student Name: "+s.name);
			System.out.println("Student Marks: "+s.marks);
			System.out.println("Student Grade: "+f.apply(s));
			System.out.println();
		}
	}

	private static void populate(ArrayList<Student> l) {
		l.add(new Student("Sunny",100));
		l.add(new Student("Bunny",65));
		l.add(new Student("Chinny",55));
		l.add(new Student("Vinny",45));
		l.add(new Student("Pinny",25));
	}
	
}