package singleton;

public class AadharCard {

	private static AadharCard ac = null;

	private AadharCard() {

		System.out.println("AadharCard Object Created");
	}

	public static void createAadharCardObject() {
		if(ac == null) {
			ac = new AadharCard();
		}
	}
}





