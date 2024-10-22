package Day1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Object> l = new ArrayList<Object>();

		// add() is used to add an object into the collection

		l.add(10);
		l.add(20.34);
		l.add(10);
		l.add(null);
		l.add("java");

		System.out.println(l);

		System.out.println("-----------");

		// size() is used to return the length od=f the collection
		System.out.println(l.size());

		System.out.println("-----------");

		// get() is used to return an object based on index position
		System.out.println(l.get(2));

		System.out.println("----------");

		// contains() is used to check an object based on the index position
		System.out.println(l.contains("java"));
		System.out.println(l.contains("Java"));

		System.out.println("----------");

		//remove() is used to remove an object based on the index position
		l.remove(2);

		System.out.println(l);

		System.out.println("----------");

		// is Empty() is used to check if the Collection is Empty or not
		System.out.println(l.isEmpty());

		System.out.println("----------");
		// clear() will remove all the objects from the collections
		l.clear();

		System.out.println(l.isEmpty());

		System.out.println("----------");

		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(60);

		System.out.println(x);

		System.out.println("--------");

		//indexOf() is used to find the index position of an object and first occurrence in case of duplication
		System.out.println(x.indexOf(10));

		System.out.println(x.indexOf(100)); //-1 if the object is not present

		System.out.println("--------");

		//lastindexOf() is used to find the last index position of an object

		System.out.println(x.lastIndexOf(10));

	}

}
