package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements  Comparator<Object>{

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}

public class StringBufferCompare {
	
	public static void main(String[] args) {
		
		//Default Sorting
		TreeSet<StringBuffer> t1 = new TreeSet<>();
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("Z"));
		t1.add(new StringBuffer("K"));
		t1.add(new StringBuffer("L"));
		System.out.println(t1);                  //[A, K, L, Z]
		
		//Custom Sorting
		TreeSet<StringBuffer> t2 = new TreeSet<>(new MyComparator3());
		t2.add(new StringBuffer("A"));
		t2.add(new StringBuffer("Z"));
		t2.add(new StringBuffer("K"));
		t2.add(new StringBuffer("L"));
		System.out.println(t2);                //[Z, L, K, A]
	}
}


/*
If we are depending on default natural sorting order compulsory objects should be homogeneous and comparable otherwise we will get run time exception  
class cast exception. 
 An object is said to comparable if and only if corresponding class implements comparable interface String and all wrapper classes 
    already implements comparable interface but StringBuffer class doesn't implements comparable interface hence we got in above example


Note : If we are depending on default natural sorting order compulsory objects should be homogeneous and comparable otherwise we will get
runtime exception saying  ClassCastException.
  If we are defining our own sorting by comparator then objects needs not be comparable and homogeneous
   i.e we can add heterogeneous non comparable objects also

write a program to insert String and StringBuffer objects into a TreeSet where sorting order is increasing length order if two objects having 
same length then consider their alphabetical order

 */
