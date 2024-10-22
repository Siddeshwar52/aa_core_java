package singleton;

public class PrimeMinister {

	String name = "modi";

	private static PrimeMinister pm;

	private PrimeMinister() {

		System.out.println("PM got selected");
	}

	public static PrimeMinister createAndReturnPMObject() {
		if(pm==null) {
			pm = new PrimeMinister();
		}
		return pm;
	}
}
