
// Program to display names start with 'k'

package ae_predicates;

import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {

		String[] names = {"Sunny","Kajal","Mallika","Katrina","Kareena"};
		Predicate<String> p = s->s.charAt(0)=='K';
		System.out.println("The names starting with k letter");
		for (String s : names) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
