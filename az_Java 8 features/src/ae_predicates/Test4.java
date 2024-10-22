
//Program to remove null values and empty string from list

package ae_predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {

		String[] names = {"Durga","",null,"Ravi","","Shiva",null};
		Predicate<String> p = s-> s != null && s.length() != 0;
		ArrayList<String> l = new ArrayList<String>();
		for (String s : names) {
			if(p.test(s)) {
				l.add(s);
			}
		}
		System.out.println("The valid names are "+l);
	}
}
