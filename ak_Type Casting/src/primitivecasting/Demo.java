package primitivecasting;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("---Widening---");
		
		int a = 10;
		double b = a;
		System.out.println(a+" "+b);
		
		char c = 'A';
		int d = c;
		System.out.println(c+" "+d);
		
		System.out.println("---Narrowing---");
		
		double x = 3.45;
		int y = (int) x;
		System.out.println(x+" "+y);
		
		int p = 66;
		char q = (char)p;
		System.out.println(p+" "+q);
		
	}

}
// ASCII -> American Standard code for Information Interchange
// A-> 65
