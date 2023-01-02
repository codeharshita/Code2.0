import java.util.*;
public class ExceptionHandling4 {

	public static void main(String[] args)throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int n = sc.nextInt();
		System.out.println("Enter the second number.");
		int m = sc.nextInt();
		
		if(m == 3 ) {
			//explicitly calling an exception.
			throw new ArithmeticException("Error in the input.");
		}
		
		try {
		System.out.println(n/m);
		System.out.println("Good going.");
		sc.close();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
			System.out.println("Keep going.");
	
		

	}

}
