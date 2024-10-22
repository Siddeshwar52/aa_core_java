package day4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Students s1 = new Students(21,"Tom");
		Students s2 = new Students(22, "Jerry");
		Students s3 = new Students(23, "smith");

		ArrayList<Students> l = new ArrayList<Students>();

		l.add(s1);
		l.add(s2);
		l.add(s3);

		for(Students o: l) {

			System.out.println(o);
			System.out.println("Name: "+o.name+" Age:"+o.age);
			System.out.println("------------");
		}

	}

}
