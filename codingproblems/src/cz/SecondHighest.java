package cz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.addAll(Arrays.asList(10,5,20,15,25));
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l.get(1));

	}

}
