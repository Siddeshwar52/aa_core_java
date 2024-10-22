package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);

		long a = list.stream().filter(i -> i >= 50).count();

		System.out.println(a);

		List<Integer> updatedlist = list.stream().filter(i -> i > 20).collect(Collectors.toList());

		System.out.println(updatedlist);

		List<Integer> updatedlist2 = list.stream().map(i -> i * 10).collect(Collectors.toList());

		System.out.println(updatedlist2);

		List<Integer> updatedlist3 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(updatedlist3);

		int maximum = list.stream().max((i1, i2) -> i1 > i2 ? 1 : i1 < i2 ? -1 : 0).get();

		System.out.println(maximum);

		list.stream().filter(i -> i <= 50).forEach(System.out::println);

	}

}
