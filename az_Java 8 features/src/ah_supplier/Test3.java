
//To generate a password 8 char long password with odd numbers characters and even numbers integer

package ah_supplier;

import java.util.function.Supplier;

public class Test3 {

	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@$";
			Supplier<Integer> d = ()->(int) (Math.random()*10);
			Supplier<Character> c = ()->symbols.charAt((int) (Math.random()*29));
			String pwd = "";
			
			for (int i=0; i<9; i++) {
				if(i%2==0) pwd = pwd+d.get();
				else pwd = pwd+c.get();
			}
			return pwd;
		};
		
		System.out.println("Random Password generated: "+s.get());
		System.out.println("Random Password generated: "+s.get());
		System.out.println("Random Password generated: "+s.get());
		
	}
}
