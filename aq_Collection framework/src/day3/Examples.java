package day3;

import java.util.ArrayList;

public class Examples {
	
	public static void main(String[] args) {
		
		int a = 10;
		char b = 'Z';
		
		ArrayList<Object> l = new ArrayList<Object>();
		
		l.add(a);      // l.add(new Integer(a)); --> l.add(new Integer(10));
		l.add(20.45);  // l.add(new Double(20.45));
		l.add(b);      // l.add(new Character(b)); -->l.add(new Character(Z));
		
		for(Object o: l) {
			
			System.out.println(o);
		}
		
	}

}
