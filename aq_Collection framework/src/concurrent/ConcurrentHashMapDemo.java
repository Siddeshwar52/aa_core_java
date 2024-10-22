package concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

	static ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<Object, Object>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		System.out.println("Child Thread updating Map");
		map.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException {

		map.put(101, "A");
		map.put(102, "B");

		ConcurrentHashMapDemo t = new ConcurrentHashMapDemo();
		t.start();

		Iterator<Object> itr = map.keySet().iterator();
		
		while (itr.hasNext()) {
			Integer i1 = (Integer) itr.next();
			System.out.println(i1 + " " + map.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(map);
	}

}

// If we replace ConcurrentHashMapDemo with HashMap we will get ConcurrentModificationException.