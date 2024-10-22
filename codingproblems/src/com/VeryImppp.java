package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VeryImppp {

	public static void main(String[] args) {

		System.out.println("-----------------1--------------------");

		String str1 = "welcome to code decode & code decode welcome you";

		Map<String, Long> map1 = Arrays.stream(str1.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Grouped Strings: " +map1);

		System.out.println("-----------------2--------------------");

		String str2 = "ilovejavatechie";

		Map<String, Long> map2 = Stream.of(str2.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Grouped Strings: " + map2);

		System.out.println("------------------3-------------------");

		Map<Integer, List<String>> map3 = Stream.of("apple", "banana", "pear", "grape")
				.collect(Collectors.groupingBy(s->s.length()));

		System.out.println("Grouped Strings: " + map3);
		
		List<Integer> list = Arrays.asList(2, 3, 4,4, 5, 6, 7,7, 8, 9, 10, 11, 12, 13, 13, 14, 14, 14);
		
		Set<Integer> hs = new HashSet<>();
		
		list.stream().filter(i->!hs.add(i)).forEach(System.out::println);
		

	}

}
