package JavaBasics;
import java.util.Scanner;

 
/** To check whether the number is neon number or not.
 * 
 * A neon number is a number where the sum of digits of 
 * the square of the number is equal to the number. 
 * 
 * */
public class NeonNumber {
	
	/**
	 * checkNeonNumber is a method which checks the number is Neon or not.
	 * @para This takes the number as a input.
	 * @return boolean value true/false.
	 * */
	
	public static boolean checkNeonNumber(int number) {
		
		int sum=0;
		int squaredNumber = number*number;
		
		while(squaredNumber >0) {
			int remainder =  number % 10;
			sum += remainder;
			squaredNumber = squaredNumber / 10;
			
		}if(sum == number ) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		//User Input.
		int number = sc.nextInt();
		
		if(checkNeonNumber(number)) {
			System.out.println("The number "+ number + " is a neon number");
		}else {
			System.out.println("The number "+ number +" is not a neon number.");
			sc.close();
		}
		
	}

}
