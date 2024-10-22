
//Program to check whether software engineer is allowed into pub or not using predicate 

package ae_predicates;

import java.util.function.Predicate;

class SoftwareEngineer{
	
	 String name;
	 int age;
	 boolean isHavingGf;
	 
	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		
		SoftwareEngineer[] list = {new SoftwareEngineer("Durga", 60, false),
				                   new SoftwareEngineer("Sunil", 25, true),      
				                   new SoftwareEngineer("Subbu", 28, false),      
				                   new SoftwareEngineer("Ravi", 17, true)};
		
		Predicate<SoftwareEngineer> p = se->se.age>18 && se.isHavingGf;
		System.out.println("The allowed Software Engineers are ");
		
		for (SoftwareEngineer s : list) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
