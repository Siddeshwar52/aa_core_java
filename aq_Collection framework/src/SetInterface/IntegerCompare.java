/*Write a program  to insert integer objects into a TreeSet where the sorting order is descending order
In constructor calling if we  are not passing comparator object then internally JVM will call compatrTo method which is meant for
default sorting order if we are passing comparator JVM will call compare method meant for custom sorting */  

package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyComparator implements  Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {

		//return (i1<i2)?1:(i1>i2)?-1:0;
		//return i1.compareTo(i2);              // default sorting
		//return -i1.compareTo(i2);
		return i2.compareTo(i1);
	}
}

public class IntegerCompare {
	
	public static void main(String[] args) {
		
		//Default Sorting 
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.addAll(Stream.of(0,15,5,20,20).collect(Collectors.toList()));
		System.out.println(t1);
		
		//Custom Sorting
		TreeSet<Integer> t2 = new TreeSet<Integer>(new MyComparator());
		t2.addAll(Stream.of(0,15,5,20,20).collect(Collectors.toList()));
		System.out.println(t2);
		
	}
}

