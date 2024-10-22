// Demo program to sort elements of ArrayList according to Default Natural Sorting(Ascending) 

package ac_lamdaexpressionswithcollections;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);l.add(0);l.add(15);l.add(5);l.add(20);
		System.out.println("Before Sorting "+l);
		Collections.sort(l);
		System.out.println("After Sorting "+l);
		
//		Before Sorting [10, 0, 15, 5, 20]
//	    After Sorting [0, 5, 10, 15, 20]
		
	}

}
