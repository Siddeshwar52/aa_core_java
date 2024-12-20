//Method biding is happrning during compile time 

package complietime;

 class Myntra {

	void purchase(String productName) {

		System.out.println(productName);
	}

	void purchase(int productId) {

		System.out.println(productId);
	}

	void purchase(String productName, int cost) {

		System.out.println(productName+" "+cost);
	}	
	
	void purchase(int cost, String productName) {

		System.out.println(cost+ " "+productName);
	}	
}



public class Customer {
	
	public static void main(String[] args) {
		
		Myntra m = new Myntra();
		m.purchase(101);
		m.purchase(1000, "Mobile");
		m.purchase("Laptop");
		m.purchase("Shoe", 500);
	}
}

