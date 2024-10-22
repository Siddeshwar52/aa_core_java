
//Program to display movie information by using consumer

package ag_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movie{
	
	String name;
	String hero;
	String heroine;
	
	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

public class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> l = new ArrayList<Movie>();
		
		 l.addAll(Stream.of(new Movie("Bahubali", "Prahabas", "Anushka"),new Movie("Rayees", "Sharukhan", "Ritu"),new Movie("Dangal", "Salman", "Anuksha")
				        ).collect(Collectors.toList()));
				
		Consumer<Movie> c = m->{
			System.out.println("Movie Name: "+m.name);
			System.out.println("Hero Name: "+m.hero);
			System.out.println("Heroine Name: "+m.heroine);
			System.out.println();
		};
		
		for (Movie m : l) {
			c.accept(m);
		}
		
	}
}
