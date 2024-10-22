// TreeSet natural and custom sorting

package ac_lamdaexpressionswithcollections;

import java.util.TreeSet;

public class Test5 {
	
	public static void main(String[] args) {
		
		//Default sorting
		TreeSet<Integer> l = new TreeSet<Integer>();
		l.add(10);l.add(0);l.add(15);l.add(5);l.add(20);
		System.out.println(l); //[0, 5, 10, 15, 20]
		
		//Custom Sorting
		TreeSet<Integer> l1 = new TreeSet<Integer>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		l1.add(10);l1.add(0);l1.add(15);l1.add(5);l1.add(20);
		System.out.println(l1); //[20, 15, 10, 5, 0]
		
	}
}
