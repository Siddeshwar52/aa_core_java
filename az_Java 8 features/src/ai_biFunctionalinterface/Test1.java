package ai_biFunctionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test1 {
	
	public static void main(String[] args) {
		
		//BiPredicate()
		
		BiPredicate<Integer, Integer> p = (a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));
		
		//BiFunction()
		
		BiFunction<Integer, Integer, Integer> f = (a,b)->a*b;
		System.out.println(f.apply(10, 20));
		System.out.println(f.apply(100, 200));
		
		//BiConsumer()
		
		BiConsumer<String, String> c = (s1, s2)->System.out.println(s1+s2);
		c.accept("Siddu", "Korwar");
		
	}
}
