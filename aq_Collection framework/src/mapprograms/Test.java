package mapprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Tom", 22);
		hm.put("jerry", 21);
		hm.put("bheem", 20);

		Set<String> s1 = hm.keySet();

		for(String Key : s1) {

			System.out.println(Key+" is "+hm.get(Key)+" years old");
		}

		System.out.println("------------------");

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(10, "Java");
		lhm.put(20, "sql");
		lhm.put(30, "web");

		Set<Integer> s = lhm.keySet();

		for(int Key : s) {
			//System.out.println(Key);
			System.out.println(Key+"--->"+lhm.get(Key));
		}

		System.out.println("------------------");

		TreeMap<Integer, Double> t = new TreeMap<>();

		t.put(20, 1.5);
		t.put(30, 2.3);
		t.put(10, 4.5);

		Set<Integer> s2 = t.keySet();

		for(int Key : s2) {
			System.out.println(Key+" : "+t.get(Key));
		}

	}
}



//bheem is 20 years old
//Tom is 22 years old
//jerry is 21 years old
//------------------
//10--->Java
//20--->sql
//30--->web
//------------------
//10 : 4.5
//20 : 1.5
//30 : 2.3

