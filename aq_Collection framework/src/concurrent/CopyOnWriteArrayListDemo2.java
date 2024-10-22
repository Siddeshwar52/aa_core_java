package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 extends Thread {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Object> l = new CopyOnWriteArrayList<>();

		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");

		System.out.println(l);

		Iterator<Object> itr = l.iterator();

		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			if (s1.equals("D")) {
				itr.remove();
			}
		}
		System.out.println(l); // java.lang.UnsupportedOperationException
	}
}

/*
 * -> If we replace CopyOnWriteArrayList with ArrayList then we will not get
 *    UnsupportedOperationException
 * 
 * -> In this case output will be [A, B, C, D] [A, B, C]
 * 
 * 
 */