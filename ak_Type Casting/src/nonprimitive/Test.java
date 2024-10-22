package nonprimitive;

public class Test {
	
	public static void main(String[] args) {
		
	/* UPCASTING*/	
	Father f = new Son();
	System.out.println(f.age);// f.name will give error
	
	/* DOWNCASTING*/
	Son s = (Son) f;
	System.out.println(f.age+" "+s.name);
	}

}
