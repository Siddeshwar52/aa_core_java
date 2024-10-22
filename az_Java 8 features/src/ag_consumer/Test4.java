
//Consumer Chaining 

package ag_consumer;

import java.util.function.Consumer;

class Movies{
	
	String name;
	String result;
	
	Movies(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

public class Test4 {
	
	public static void main(String[] args) {
		
		Consumer<Movies> c1 = m->System.out.println("Movie: "+m.name+" is ready to release");
		
		Consumer<Movies> c2 = m->System.out.println("Movie: "+m.name+" is Released and it is "+m.result);
		
		Consumer<Movies> c3 = m->System.out.println("Movie: "+m.name+" is stored in database");
		
		Consumer<Movies> chainedC = c1.andThen(c2).andThen(c3);
		
		Movies m1 = new Movies("bahubali", "Hit");
		chainedC.accept(m1);
		
		Movies m2 = new Movies("spide", "Flop");
		chainedC.accept(m2);
		
	}

}
