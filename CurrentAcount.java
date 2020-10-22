public class CurrentAcount extends Account {
	private int tradeLicenseNumber;
	private static final double MIN_BALANCE = 1000.0;
	public CurrentAcount() {
		
	}
	public CurrentAcount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	public void getBalance() {
		System.out.println(getAccountBalance());
	}

	public void withdraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}
