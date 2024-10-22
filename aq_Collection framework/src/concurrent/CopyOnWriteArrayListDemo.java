package concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Object> l = new CopyOnWriteArrayList<Object>();
		l.addAll(Stream.of("A", "A").collect(Collectors.toList()));
		System.out.println(l); // [A, A]
		l.addIfAbsent("B");
		l.addIfAbsent("B");
		System.out.println(l); // [A, A, B]

		ArrayList<Object> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");

		CopyOnWriteArrayList<Object> l2 = new CopyOnWriteArrayList<Object>();
		l2.add("A");
		l2.add("C");
		System.out.println(l2); // [A, C]

		l2.addAll(l1);

		System.out.println(l1); // [A, B]

		ArrayList<Object> l3 = new ArrayList<>();
		l3.add("A");
		l3.add("D");
		l2.addAllAbsent(l3);
		System.out.println(l2); // [A, C, A, B, D]

	}

}
