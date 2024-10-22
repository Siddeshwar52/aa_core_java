package singleton;

public class Test {

	public static void main(String[] args) {

		PrimeMinister pm = PrimeMinister.createAndReturnPMObject();

		System.out.println("Name: "+pm.name);
	}

}
