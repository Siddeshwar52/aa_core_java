
// write a program to insert a string elements into a TreeSet where all elements should be inserted reverse of alphabetical order

package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements  Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		//return 1;                 // [Raja, ShobaRani, Rajakumari, Ramulamma]
		//return -1;                // [Ramulamma, Rajakumari, ShobaRani, Raja]
		//return 0;                 // [Raja]
		//return -s1.compareTo(s2); // [ShobaRani, Ramulamma, Rajakumari, Raja]
		return s2.compareTo(s1);    // [ShobaRani, Ramulamma, Rajakumari, Raja]
	}
}

public class StringCompare {
	
	public static void main(String[] args) {
		
		// Default Sorting
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Raja");
		t1.add("ShobaRani");
		t1.add("Rajakumari");
		t1.add("Ramulamma");
		System.out.println(t1); //[Raja, Rajakumari, Ramulamma, ShobaRani]
		
		// Default Sorting
		TreeSet<String> t2 = new TreeSet<String>(new MyComparator2());
		t2.add("Raja");
		t2.add("ShobaRani");
		t2.add("Rajakumari");
		t2.add("Ramulamma");
		System.out.println(t2); //[Raja, Rajakumari, Ramulamma, ShobaRani]
		
	}

}
