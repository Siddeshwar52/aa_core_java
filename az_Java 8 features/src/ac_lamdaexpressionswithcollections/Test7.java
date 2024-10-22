// Sorting for customized class objects using lamda expressions

package ac_lamdaexpressionswithcollections;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int eno;
	String ename;
	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
}
 
 public class Test7{
	 public static void main(String[] args) {
		 ArrayList<Employee> l = new ArrayList<Employee>();
		 l.add(new Employee(1,"AA"));
		 l.add(new Employee(4,"DD"));
		 l.add(new Employee(2,"BB"));
		 l.add(new Employee(3,"CC"));
		 System.out.println("Before Sorting "+l);
		 Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		 System.out.println("After Sorting "+l);
//Before Sorting [Employee [eno=1, ename=AA], Employee [eno=4, ename=DD], Employee [eno=2, ename=BB], Employee [eno=3, ename=CC]]
//After Sorting [Employee [eno=4, ename=DD], Employee [eno=3, ename=CC], Employee [eno=2, ename=BB], Employee [eno=1, ename=AA]]
	}
 }
