package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		l.add("10");
		l.add("20.45");
		l.add("String");

		for(String s : l) {

			System.out.println(s);

			System.out.println("-------");

			LinkedList<Integer> x = new LinkedList<Integer>();

			x.add(19);
			x.add(20);
			x.add(30);

			for(int i : x) {

				System.out.println(i);
			}

		}
	}

}
