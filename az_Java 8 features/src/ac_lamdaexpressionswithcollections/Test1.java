package ac_lamdaexpressionswithcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
	
	public static void main(String[] args) {
		
		//List
		ArrayList<String> l = new ArrayList<String>();
		l.add("Sunny");l.add("Bunny");l.add("Chinny");l.add("Sunny");
		System.out.println(l);  //[Sunny, Bunny, Chinny, Sunny]
		
		//Set
		HashSet<String> h = new HashSet<String>();
		h.add("Sunny");h.add("Bunny");h.add("Chinny");h.add("Sunny");
		System.out.println(h);  //[Chinny, Bunny, Sunny]
		
		//Map
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Apple");hm.put("Z", "Zebra");
		hm.put("B", "Boy");hm.put("T", "Tiger");
		System.out.println(hm);  //{A=Apple, B=Boy, T=Tiger, Z=Zebra}
		
	}
}
