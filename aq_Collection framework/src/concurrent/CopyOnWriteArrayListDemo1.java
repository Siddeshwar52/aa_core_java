package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo1 extends Thread {

	static CopyOnWriteArrayList<Object> l = new CopyOnWriteArrayList<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.println("Child Thread Updating List");
		l.add("C");
	}

	public static void main(String[] args) throws InterruptedException {

		l.add("A");
		l.add("B");

		CopyOnWriteArrayListDemo1 t = new CopyOnWriteArrayListDemo1();
		t.start();

		Iterator<Object> itr = l.iterator();

		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Main Thread Iterating List and Current Object is: " + s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}

/*
 * -> In above example while main thread iterating list child thread is allowed
 * to modify and we will not get ConcurrentModificationException -> If we
 * replace CopyOnWriteArrayList with ArrayList then we will get
 * ConcurrentModificationException
 * 
 * -> Iterator of CopyOnWriteArrayList can't perform remove operation otherwise
 * we will get runtimeException : UnsupportedoperationException
 * 
 */