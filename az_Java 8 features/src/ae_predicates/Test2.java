
//Predicate Joining add()   or()  negate()

package ae_predicates;

import java.util.function.Predicate;

public class Test2 {
	public static void main(String[] args) {
		int[] x = {0,5,10,20,25,30};
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		System.out.println("The numbers greater than 10 are ");
		m1(p1, x);
		System.out.println("The Even numbers are ");
		m1(p2, x);
		System.out.println("The numbers not greater than 10 are ");
		m1(p1.negate(), x);
		System.out.println("The numbers greater than 10 and even are ");
		m1(p1.and(p2), x);
		System.out.println("The numbers greater than 10 or even are ");
		m1(p1.or(p2), x);
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for (int i:x ) {
			if(p.test(i)) {
				System.out.print(i);
				System.out.print(" , ");
			}
		}
		System.out.println();
	}
}
