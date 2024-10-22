
//Functional Chaining and static method

package af_functions;

import java.util.Scanner;
import java.util.function.Function;

public class Test7 {
	
	public static void main(String[] args) {
		
		Function<String, String> f1 = s->s.toUpperCase();
		Function<String, String> f2 = s->s.substring(0, 9);
		
		System.out.println("The Result of f1 "+f1.apply("AishwarayaAbhi"));
		System.out.println("The Result of f2 "+f2.apply("AishwarayaAbhi"));
		System.out.println("The Result of f1.andThen(f2) "+f1.andThen(f2).apply("AishwarayaAbhi"));
		System.out.println("The Result of f1.compose(f2) "+f1.compose(f2).apply("AishwarayaAbhi"));
		
		System.out.println("------------------------------------------");
		
		Function<Integer, Integer> f3 = i->i+i;
		Function<Integer, Integer> f4 = i->i*i*i;
		System.out.println("The Result of f3 "+f3.apply(2));
		System.out.println("The Result of f3 "+f4.apply(2));
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
		
		System.out.println("------------------------------------------");
		
		Function<String, String> f5 = s->s.toLowerCase();
		Function<String, String> f6 = s->s.substring(0, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		sc.close();
		if(f5.andThen(f6).apply(username).equalsIgnoreCase("durga")&&password.equals("java"))
		System.out.println("Valid user");
		else System.out.println("Invalid user");
		
		System.out.println("------------------------------------------");
		
		Function<String, String> f7 = Function.identity();
		System.out.println(f7.apply("password"));
		
		
	}
}
