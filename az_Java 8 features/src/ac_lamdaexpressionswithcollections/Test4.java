//Demo program to sort elements of ArrayList according to Custom Sorting(Descending) with lamda expression

package ac_lamdaexpressionswithcollections;

import java.util.ArrayList;
import java.util.Collections;

class Test4{

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);l.add(0);l.add(15);l.add(5);l.add(20);
		System.out.println("Before Sorting "+l);
		Collections.sort(l, (i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		System.out.println("After Sorting "+l);
	}
}

//Before Sorting [10, 0, 15, 5, 20]
//After Sorting [20, 15, 10, 5, 0]