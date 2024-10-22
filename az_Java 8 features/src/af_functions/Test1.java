
//Functions

package af_functions;

import java.util.function.Function;

public class Test1 {
	
	public static void main(String[] args) {
		
		// to calculate the length of a given string
		
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));
		
		// program to remove spaces present in the given string
		
		String s = "Siddeshwar Korwar Software Engineer";
		Function<String,String> f1 = s1->s1.replaceAll(" ", "");
		System.out.println(f1.apply(s));
		
		//program to find number of spaces present in the given string
		Function<String,Integer> f2 = s1->s1.length()-s1.replaceAll(" ", "").length();
		System.out.println(f2.apply(s));
		
	}
}
