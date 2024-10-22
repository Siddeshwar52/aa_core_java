package nonprimitive;

public class Demo {
	public static void main(String[] args) {
		
		Vehicle v = new Class();
		System.out.println(v.brand);
		v.start();
	    //v.stop();
		
		System.out.println("---------");
		
		Class c = (Class) v;
		System.out.println(c.brand+" "+c.fuel);
		c.start();
		c.stop();
	}
}
