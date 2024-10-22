
//Primitive type of Functional Interface

package aj_primitivetypefunctionalinterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Test2 {

	public static void main(String[] args) {
		
		//square of a given integer
		IntFunction<Integer> f1 = i->i*i;
		System.out.println(f1.apply(2));
		
		//length of a given strnig
		ToIntFunction<String> f2 = s->s.length();
		System.out.println(f2.applyAsInt("Siddu"));
		
		//square root
		
		IntToDoubleFunction f3 = i->Math.sqrt(i);
		System.out.println(f3.applyAsDouble(4));
		System.out.println(f3.applyAsDouble(5));
		
	}
}

//There are 15 primitive functional interfaces in Function Interfaces
