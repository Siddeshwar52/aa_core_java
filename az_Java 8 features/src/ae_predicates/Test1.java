//Predicate

package ae_predicates;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
import java.util.function.Predicate;

public class Test1 {
	
	public static void main(String[] args) {
		
		// write a predicate to check whether given integer is greater than 10 or not
		
		Predicate<Integer> p = i->i>10;
		System.out.println(p.test(10));
		System.out.println(p.test(5));
		System.out.println(p.test(20));
		
		// write a program to check the length of a given string is greater than 3 or not
		
		Predicate<String> p1 = s->s.length()>3;
		System.out.println(p1.test("siddu"));
		System.out.println(p1.test("s"));
		
		// write a program to check collection empty or not
	
//		List<Collection> l = new ArrayList<Collection>();
//		Predicate<Collection> p2 = a->a.isEmpty();
//		System.out.println(p2.test(l));
//		l.add(l);
//		System.out.println(p2.test(l));
		
		
		
		
		
	}

}
