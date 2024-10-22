
//To collect only even numbers from the array list

package al_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		for (int i=0; i<10; i++) {
				l.add(i);
		}
		System.out.println("l "+l);
		
		//Without Streams
		ArrayList<Integer> l1 = new ArrayList<>();
		for (Integer i : l) {
			if(i%2==0) {
				l1.add(i);
			}
		}
		System.out.println("l1 "+l1);
		
		//with streams filter()
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("l2 "+l2);
		
		//collect()
		ArrayList<String> l3 = new ArrayList<>();
		l3.addAll(Stream.of("rvk","rk","rkv","rvki","rvkir").collect(Collectors.toList()));
		System.out.println(l3);
		List<String> l4 = l3.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l4);
		
		//count()
		long count =l3.stream().filter(s->s.length()==2).count();
		System.out.println("The number of 2 length string is "+count);
		
		//sorted()
		List<String> l5 =l3.stream().sorted().collect(Collectors.toList());
		System.out.println("According natural order "+l5);
		List<String> l6 =l3.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("According to customized order "+l6);
		
	}
}
