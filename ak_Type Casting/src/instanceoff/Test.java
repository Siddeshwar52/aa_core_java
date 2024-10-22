package instanceoff;

class Father{
	int x = 30;
}

class Son extends Father{
	int y =20;
}

class Daughter extends Father{
	int z = 10;
}

public class Test {

	public static void main(String[] args) {
		
		Son s = new Son();
		Daughter d = new Daughter();
		Father f = new Father();
		
		System.out.println(s instanceof Son);     //true
		System.out.println(s instanceof Father);  // true
		
		System.out.println(d instanceof Daughter); // true
		System.out.println(d instanceof Father);  //true
		
		System.out.println(f instanceof Father);  //true
		System.out.println(f instanceof Son);     //false
		System.out.println(f instanceof Daughter); //false
		
		System.out.println("----------------");
		
		System.out.println(new Son() instanceof Father);  //true
		System.out.println(new Father() instanceof Daughter);  //false
		System.out.println(new Daughter() instanceof Daughter); //true
		
		Father f1 = new Daughter();
		
		if(f1 instanceof Son) {
			System.out.println("Downcasting to Son");
			Son s1 = (Son) f1;
			System.out.println(s1.x+" "+s1.y);
			
		}else if(f1 instanceof Daughter) {
			System.out.println("Downcasting to Daughter");
			Daughter d1 = (Daughter) f1;
			System.out.println(d1.x+" "+d1.z);
		}
	}
}
