package ad_defaultandstaticmethods;

interface Interf{
	public static void sum(int a, int b) {
		System.out.println("The sum is: "+(a+b));
	}
}

public class Test2 implements Interf{
	public static void main(String[] args) {
		//Test2 t = new Test2();
		//t.sum(2,2);    // CE  The method sum(int, int) is undefined for the type Test2
		//Test2.sum(2,2); //CE  he method sum(int, int) is undefined for the type Test2
		Interf.sum(2, 2);
	}
}
