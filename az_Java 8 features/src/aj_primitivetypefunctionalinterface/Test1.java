
//Primitive type Predicate Interface

package aj_primitivetypefunctionalinterface;

import java.util.function.IntPredicate;

public class Test1 {
	
	public static void main(String[] args) {
		
		//Demo program for IntPredicate
		
		int[] x = {0,5,10,15,20,25};
		IntPredicate p = i->i%2==0;
		for(int x1 : x ) {
			if(p.test(x1))
				System.out.println(x1);
		}
	}
}

//various primtive type of predicate function
//1. IntPredicate
//2. LongPredicate
//3. DoublePredicate