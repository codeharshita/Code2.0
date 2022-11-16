 class Account {
	
	private long AccountNumber;
	String name;
	String address;
	long phoneNumber;
	String dob;
	private double balance;
	 
	public Account(String name, String address, long phoneNumber, String dob,long AccountNumber, double balance) {
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.dob=dob;
		this.AccountNumber=AccountNumber;
		this.balance=balance;
		
	}
	
	public long getAccountNumber() {
		return AccountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setAccountNumber(long AccountNumber) {
		if(AccountNumber<=0) {
			throw new IllegalArgumentException("Invalid Account Number.");
		}else
		this.AccountNumber=AccountNumber;
	}
	public void setBalance(double balance) {
		if(balance<0) {
			throw new IllegalArgumentException("Balance is very low");
		}else
		this.balance=balance;
	}
	
}
 class SavingsAccounts extends Account{

	public SavingsAccounts(String name, String address, long phoneNumber, String dob, long AccountNumber,
			double balance) {
		super(name, address, phoneNumber, dob, AccountNumber, balance);
		
	}
	
	public double deposit(double balance) {
		return balance;
	}
	public double withdraw(double balance) {
		return balance;
	}
	 
 }




