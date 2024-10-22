
// UnaryOperator<T>
// If input and output are same type then we should go for UnaryOperator
// It is a child of Function<T,T>

package aj_primitivetypefunctionalinterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test5 {
	
	public static void main(String[] args) {
		
		//Function<Integer, Integer> f = i->i*i;
		UnaryOperator<Integer> f = i->i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(25));
		
		//primitive version of UnaryOperator
        //1.IntUnaryOperator 2.LongUnaryOperator 3.DDoubleUnaryOperator
		
		IntUnaryOperator f1 = i->i*1;
		System.out.println(f1.applyAsInt(6));
		
		IntUnaryOperator f2 = i->i*i;
		System.out.println(f1.andThen(f2).applyAsInt(4));
	}
}
