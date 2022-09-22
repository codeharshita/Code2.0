package JavaBasics;
import java.util.*;

public class SumFunct {
	
	public static int printSum(int number1, int number2) {
		int numberResult = number1+number2;
		return numberResult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number.");
		int number2 = sc.nextInt();
		
		System.out.println("The sum is: "+ printSum(number1,number2));
		sc.close();
		

	}

}
