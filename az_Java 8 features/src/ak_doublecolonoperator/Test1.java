package ak_doublecolonoperator;

interface  Interf{
	public void m1(int i);
}

public class Test1 {
	
	public void m2(int i) {
		System.out.println("From Method Reference "+i);
	}
	
	public static void main(String[] args) {
		
		Interf f = i->System.out.println("From lamds expression: "+i);
		f.m1(10);
		
		Test1 t = new Test1();
		Interf f1 = t::m2;
		f1.m1(20);
		
	}
}
