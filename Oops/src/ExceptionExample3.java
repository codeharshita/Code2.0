import java.util.*;
public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number.");
		int num2 = sc.nextInt();
		
	
		
		System.out.println(num1/num2);
		System.out.println("You did it.");
		sc.close();
		
		}
		//Multi-catch block handling.
		catch(ArithmeticException | InputMismatchException e ) {
			System.out.println(e);
			
		}
		
			System.out.println("Better write the good input.");
	}

}
