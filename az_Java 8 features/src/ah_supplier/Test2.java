
//To Supply system date and random one time password

package ah_supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Test2 {
	
	public static void main(String[] args) {
		
		Supplier<Date> s1 = ()-> new Date();
		System.out.println(s1.get());
		
		System.out.println("---------------------------");
		
		Supplier<String> s2 = ()-> {
			
			String otp = "";
			for (int i=0; i<6; i++) {
				int x = (int) (Math.random()*10);
				otp = otp+x;
			}
			return otp;
		};
		
		System.out.println("Random OTP: "+s2.get());
		System.out.println("Random OTP: "+s2.get());
		System.out.println("Random OTP: "+s2.get());
		
		System.out.println("---------------------------");
	}
}
