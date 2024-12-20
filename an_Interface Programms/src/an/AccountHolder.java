package an;

public class AccountHolder implements HDFCBank {

	@Override
	public void deposit() {

		System.out.println("Withdrawn");
	}

	@Override
	public void withdraw() {

		System.out.println("Deposited");
	}

	public static void main(String[] args) {
		AccountHolder acc = new AccountHolder();

		acc.deposit();
		acc.withdraw();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
