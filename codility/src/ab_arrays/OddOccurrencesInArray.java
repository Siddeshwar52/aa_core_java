package ab_arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
	
	public static void main(String[] args) {
		
		int[] a = {9,3,9,3,9,7,9};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(set.contains(a[i])) set.remove(a[i]);
			
			else set.add(a[i]);
		}
		
		System.out.println(set);
	}

}
