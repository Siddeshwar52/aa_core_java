package day2;

import java.util.ArrayList;

public class Solutions {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);

		System.out.println(l);

		// add() is used to add an object based on the index position
		// already existing objects gets shifted to the next position
		l.add(1, 50);

		System.out.println(l);

		//set() is used to add an object based on the index position
		// already existing object gets overridden

		l.set(1, 50);

		System.out.println(l);


	}
}
