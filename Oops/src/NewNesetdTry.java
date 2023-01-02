
public class NewNesetdTry {

	public static void main(String[] args) {
	try {
		System.out.println(3/0);
		
		
		try {
			System.out.println(4/0);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Inner try-catch block executed."+"Arithmetic Exception is caught.");
		}
		
		
		
	}
	catch(ArithmeticException e) {
		System.out.println("Outer try-catch block executed."+"Arithmetic Exception is handled.");
	}
	    System.out.println("Thanks for using our software.");
	
	
	
	
	}
	

}
