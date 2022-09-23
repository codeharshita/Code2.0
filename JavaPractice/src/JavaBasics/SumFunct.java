package JavaBasics;
import java.util.*;

public class SumFunct {
	
<<<<<<< HEAD
	public static int printSum(int number1, int number2) {
		int numberResult = number1+number2;
		return numberResult;
=======
	public static int printSum(int a, int b) {
		int c = a+b;  
		return c;  //return a+b;
>>>>>>> branch 'master' of https://github.com/codeharshita/Code2.0.git
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number.");
		int number2 = sc.nextInt();
		
<<<<<<< HEAD
		System.out.println("The sum is: "+ printSum(number1,number2));
		sc.close();
		
=======
		System.out.println("The sum is: "+ printSum(a,b));
		sc.close();
>>>>>>> branch 'master' of https://github.com/codeharshita/Code2.0.git

	}

}
