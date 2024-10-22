package al_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(70, 45, 10, 65, 20, 25);
		System.out.println("Original Marks:" + marks);

		// filter to filter the elements
		List<Integer> lessmarks = marks.stream().filter(i -> i < 35).collect(Collectors.toList());
		System.out.println("Marks Less than 35:" + lessmarks);

		// map to create a new elements from the existing elements
		List<Integer> updatedmarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("Updated Marks:" + updatedmarks);

		// count
		long failedNoStudents = marks.stream().filter(i -> i < 35).count();
		System.out.println("Failed No of Students: " + failedNoStudents);

		// Sorting sorted()
		List<Integer> sortedmarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Sorting :" + sortedmarks);

		// Custom Sorting //(i1, i2) ->((i1<i2)?1:(i1>i2)?-1:0
		List<Integer> customsortedmarks = marks.stream().sorted((i1, i2) -> (i2.compareTo(i1)))
				.collect(Collectors.toList());
		System.out.println("Custom Sorting :" + customsortedmarks);

		// minimum and maximum always called upon sorting without sorting there is no
		// minimum and max
		// minimum according to ascending
		int min = marks.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimun marks:" + min);

		// minimum according to ascending
		int min1 = marks.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Minimun marks:" + min1);

		// maximum according to ascending
		int max = marks.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum marks:" + max);

		// minimum according to ascending
		int max1 = marks.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Maximum marks:" + max1);

		// for each
		marks.stream().forEach(i->{
			System.out.println("The Square of "+i+" is: "+(i*i));
		});

	}

}
