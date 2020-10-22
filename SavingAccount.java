class SavingsAccount extends Account{

	private final static double RATE = 5;
	private final static double MAX_WITHDRAW_LIMIT = 10000.0;
	private final static double MIN_BALANCE = 1000.0;
	public SavingsAccount() {
		
	}
	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	public double getBalance() {
		double interest;
		if(getAccountBalance() >= MIN_BALANCE) {
			interest = getAccountBalance() * RATE;
		} else 
			interest = 0.0;
		return interest;
	}
	
	public void withdraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}