package ag_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{

	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> l = new ArrayList<>();
		l.addAll(Stream.of(new Student("Sunny", 100), new Student("Bunny", 65), new Student("Chinny", 55),
				           new Student("Vinnny", 45), new Student("Pinny", 25)).collect(Collectors.toList()));
		
		Predicate<Student> p = s->s.marks>60;
		
		Function<Student, String> f = s->{
			int marks = s.marks;
			return (marks>=80)?"A[Distinction]":(marks>=60)?"B[First Class]":
			    (marks>=50)?"C[Second Class]":(marks>=35)?"D[Third Class]":"E[Failed]";};
			    
	    Consumer<Student> c = s->{
	    	System.out.println("Student Name: "+s.name);
	    	System.out.println("Student Marks: "+s.marks);
	    	System.out.println("Student Grade: "+f.apply(s));
	    	System.out.println();
	    };
	    
	    for (Student s : l) {
	    	
	    	if(p.test(s)) {
	    		c.accept(s);
	    	}
		}
	}
}
