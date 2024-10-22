package com;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	
public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello ", "J", "A", "V", "A!");
		
		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);

	}

}
