
public class Main3 {
	
	public static void main(String[] args) {
		Account amn = new Account("Aman","Lane322 Koliwada",987678834,"12th May 1999",322344556,44453.533);
		System.out.println("Name:"+amn.name+"\nAddress:"+amn.address+"\nPhoneNumber:"+amn.phoneNumber+
				"\nDate Of Birth:"+amn.dob);
		
		amn.setAccountNumber(945669872);
		amn.setBalance(456798.87);
		
		System.out.println("Account Number:"+amn.getAccountNumber());
		System.out.println("Available balance:"+amn.getBalance());
		System.out.println();
		
		SavingsAccounts sv = new SavingsAccounts("Aman","Lane322 Koliwada",987678834,"12th May 1999",322344556,44453.533);
		System.out.println("Name:"+sv.name+"\nAddress:"+sv.address+"\nPhoneNumber:"+sv.phoneNumber+
				"\nDate Of Birth:"+sv.dob);
		System.out.println("Deposited  Money:"+sv.deposit(677896));
		System.out.println("Withdrawal Cash:"+sv.withdraw(89975.09));
		

	}

}

