package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo3 extends Thread {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Object> l = new CopyOnWriteArrayList<>();

		l.add("A");
		l.add("B");
		l.add("C");

		Iterator<Object> itr = l.iterator();

		l.add("D");

		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.print(s1);   //ABC
		}
	}
}

/*
 * -> Every Update operation will be performed on separate Copy. Hence after getting iterator if
 *   we are trying to perform any modification to the list it wont be reflected in iterator.
 * 
 * -> In the above program if we replace CopyOnWriteArrayList with ArrayList then we will get runtime exception
 *    java.util.ConcurrentModificationException
 * 
 */