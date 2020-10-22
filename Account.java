import java.util.Random;
class Account{
	
	private String memberName;
	private double accountBalance;
	
	Random random = new Random();
	private String accountNumber =10000 + random.nextInt(89999) + ""; 
	public Account() {
		
	}
	
	public Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		setAccountBalance(getAccountBalance()+amount);
	}
	
	@Override
	public String toString() {
		return "Account [memberName=" + memberName + ", accountBalance=" + accountBalance + ", accountNumber="
				+ accountNumber + "]";
	}
}

