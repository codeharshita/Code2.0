import java.util.Scanner;
public class ExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		try {
			c = a/b;// can throw exception if the user provide the invalid input.
			System.out.println("The result is " + c );
			
		}catch(Exception e) {
			System.out.println("Invalid input by the user."+ e.getMessage());
		}
		System.out.println("Program is executed.");
		sc.close();
		
	}

}
