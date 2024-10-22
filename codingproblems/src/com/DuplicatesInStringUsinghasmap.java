package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesInStringUsinghasmap {

	public static void main(String[] args) {

		String s1 = "SIDDESHWAR";

		StringBuffer sb = new StringBuffer(s1);

		System.out.println("The reverse of a given string is "+sb.reverse().toString());
		
		System.out.println("Whether the given string is palindrom -> "+s1.equals(sb.toString()));
		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		char [] ca = s1.toCharArray();
//		
//		for (char c : ca) {
//			if(map.containsKey(c)) map.put(c , map.get(c)+1);  
//			else map.put(c, 1);
//		}
//		
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			if(entry.getValue()>1) System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		



		Map<String, Long> map = Stream.of(s1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);

		for (Entry<String, Long> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	
	}
}
