package al_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.addAll(Stream.of(0,15,10,5,30,25,20).collect(Collectors.toList()));
		System.out.println(l);
		System.out.println("------------------------------------------------");
		
		//map
		List<Integer> l1 = l.stream().map(i->i+10).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("------------------------------------------------");
		
		//filter
		long count = l.stream().filter(i->i%2==0).count();
		System.out.println("Even Numbers Count: "+count);
		System.out.println("------------------------------------------------");
		
		//Default sorting
		List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Sorting: "+l3);
		System.out.println("------------------------------------------------");
		
		//Custom sorting
		List<Integer> l4 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Custom Sorting: "+l4);
		System.out.println("------------------------------------------------");
		
		//minimum
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
		Integer min =l.stream().min(comp).get();
		System.out.println(min);
		System.out.println("------------------------------------------------");
		
		//maximum
		Integer max =l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		System.out.println("------------------------------------------------");
		
		//for each
		l4.stream().forEach(i->System.out.print(i+" , "));
		System.out.println();
		l4.stream().forEach(System.out::print);
		System.out.println("------------------------------------------------");
		
		//toArray
		Integer[] ir = l.stream().toArray(Integer[]::new);
		for(Integer i : ir) {
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");
		
		//Stream.of()
		Stream<Integer> s = Stream.of(99,999,9999,99999);
		s.forEach(System.out::println);
		
		Double[] d = {10.0,10.1,10.2,10.3};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);
		System.out.println("------------------------------------------------");
		
	}
}
