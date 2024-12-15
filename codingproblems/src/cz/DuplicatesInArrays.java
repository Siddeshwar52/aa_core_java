package cz;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class DuplicatesInArrays {

	public static void main(String[] args) {

		int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

		//Printing duplicates array elements

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) System.out.println(arr[j]);
			}
		}

		//creating a new array without duplicates from set

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < arr.length; i++)  set.add(arr[i]);

		System.out.println(set);
		
		int[] arrset = set.stream().mapToInt(Number::intValue).toArray();
		
		for (int i = 0; i < arrset.length; i++) {
			System.out.println(arrset[i]);
		}
		
		//creating a new array without duplicates from map
		HashMap<Integer, Boolean> mp = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) == null){
                System.out.print(arr[i] + " ");
                mp.put(arr[i], true);
            }
		}
	
	}

}
