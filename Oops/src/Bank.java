
//Abstract Class
public abstract class Bank {
	
	//Abstract method-> A method without body
	// 50% ABSTRACTION achieved.
	//Implementaion of abstract method are shown in child class.
	
	public abstract void deposit();
	public abstract void savings();
	
	//Non-Abstract Method.
	public void loan() {
		System.out.println("Loan Sanctioned.");
	}
	

}
