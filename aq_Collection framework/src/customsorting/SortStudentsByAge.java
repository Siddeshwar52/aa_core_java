package customsorting;

import java.util.Comparator;

public class SortStudentsByAge implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {

		return x.age - y.age;
	}

}
