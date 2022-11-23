/* Inheritance is achieved and Polymorphism is 
 * achieved(RUN TIME POLYMORPHISM -Method-Overriding).
 * */


public class HDFCBank  extends Bank{
	
	@Override
	public void deposit() {
		System.out.println("Money Deposited.");
	}
	
	@Override
	public void savings() {
		System.out.println("Svings Counted.");
	}
	
	public void cashWidthdrawal() {
		System.out.println("Cash is widthdrawed.");
	}
}
