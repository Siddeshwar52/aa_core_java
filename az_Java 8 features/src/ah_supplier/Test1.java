
//Supplier to generate a random name

package ah_supplier;

import java.util.function.Supplier;

public class Test1 {
	
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			String[] names = {"Sunny", "Bunny", "Chinny", "Vinny"};
			int x = (int) (Math.random()*4);
			return names[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
