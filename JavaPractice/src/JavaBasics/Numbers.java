package JavaBasics;
import java.util.*;

public class Numbers {
	public static void  compareNumbers(int number1,int number2) {
		
		if(number1>number2) {
			System.out.println(number1+ " is greater");
		}else {
			System.out.println(number2+ " is greatest");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		System.out.println("Enter second number");
		int number2 =  sc.nextInt();
		
		compareNumbers(number1,number2);
		sc.close();
		

	}

}
