package day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		System.out.println("Objects inside ArrayList: "+a1+"  Size: "+a1.size());
		
		System.out.println("--------------");
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		// addAll() is used to add all the objects of one colleection into another collection.
		
		ll.addAll(a1);
		ll.add(30);
		System.out.println("Objects inside LinkedList: "+ll+" size: "+ll.size());
		
		System.out.println("--------------");
		
		// ContainsAll() is used to check if all the objects of one collection is present inside another collection or not
		System.out.println(ll.containsAll(a1));
		
		System.out.println("--------------");
		
		
		//removeAll() is used to remove all the objects of one collection from another collection
		ll.remove(1);
		
		System.out.println("Objects inside LinkedList: "+ll+" size: "+ll.size());
		System.out.println(ll.containsAll(a1));
	}

}
