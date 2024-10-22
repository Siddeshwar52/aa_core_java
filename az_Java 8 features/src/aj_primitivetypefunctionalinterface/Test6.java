
//BinaryOperator
// It is a child BiFunction<T,T,T> 

package aj_primitivetypefunctionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Test6 {
	
	public static void main(String[] args) {
		
		BiFunction<String, String, String> f1 = (s1,s2)->s1+s2;
		BinaryOperator<String> f2 = (s1,s2)->s1+s2;
		
		System.out.println(f1.apply("Siddu", "korwar"));
		System.out.println(f2.apply("Siddu", "korwar"));
		
		//Primitive versions of BinaryOperator
		//1.IntBinaryOperator 2.LongBinaryOperator 3.DDoubleBinaryOperator
		
		BinaryOperator<Integer> b1 = (i1,i2)->i1+i2;
		IntBinaryOperator b2 = (i1,i2)->i1+i2;
		
		System.out.println(b1.apply(2,2));
		System.out.println(b2.applyAsInt(3,3));
		
	}

}
