
//To Create a student object by taking name and roll number as input by using Bifunction

package ai_biFunctionalinterface;

import java.util.ArrayList;
import java.util.function.BiFunction;


class Student{
	
	String name;
	int rollno;
	
	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

public class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> l  = new ArrayList<>();
		BiFunction<String, Integer, Student> f = (name ,rollno)->new Student(name,rollno);
		
		l.add(f.apply("Durga", 100));
		l.add(f.apply("Ravi", 200));
		l.add(f.apply("Shiva", 300));
		l.add(f.apply("Pavan", 400));
		
		for (Student s : l) {
			System.out.println("Student Name: "+s.name);
			System.out.println("Student RollNo: "+s.rollno);
			System.out.println();
			
		}
	}
}
