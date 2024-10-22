package customsorting;

import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {

		Student s1 = new Student(22, "Dinga");
		Student s2 = new Student(23, "Guldu");
		Student s3 = new Student(23, "Tom");

		SortStudentsByAge age = new SortStudentsByAge();

		TreeSet<Student> t = new TreeSet<>(age);

		t.add(s1);
		t.add(s2);
		t.add(s3);

		for (Student std : t) {
			System.out.println(std);
		}
	}
}
