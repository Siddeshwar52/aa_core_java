
//Primitive type of Supplier Interface

package aj_primitivetypefunctionalinterface;

import java.util.function.IntSupplier;

public class Test4 {
	
	public static void main(String[] args) {
		
		IntSupplier s =()->(int) (Math.random()*10);
		String otp = "";
		for (int i=0; i<6; i++) {
			otp=otp+s.getAsInt();
		}
		System.out.println("The 6 digit OTP: "+otp);
	}
}

// 4 primitive supplier versions for consumer
//1.IntSupplier
//2.LongSupplier
//3.DoubleSupplier
//4.BooleanSupplier
