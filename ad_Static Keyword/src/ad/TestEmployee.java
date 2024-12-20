package ad;

// Accessing static properties in another class

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println(ad.Employee.id);
		Employee.work();

	}	
}
