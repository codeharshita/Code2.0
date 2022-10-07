package JavaBasics;
import java.util.*;

public class LargestNumber {
	
	public static void printLargestNumber(int number1, int number2,int number3) {
		if(number1>number2 && number1> number3) {
		System.out.println(number1 + " is greatest. ");
		}else if(number2>number1 && number2>number3) {
			System.out.println(number2 +" is greatest. ");;
		}else if(number3> number1 && number3> number2) {
			System.out.println(number3 + " is greatest.");
		}
		
		
	}

	public static void main(String[] args) {
     		Scanner sc = new Scanner(System.in);
     		System.out.println("Enter the first number.");
     		int number1  = sc.nextInt();
     		System.out.println("Enter the second number.");
     		int number2 = sc.nextInt();
     		System.out.println("Enter the third number.");
     		int number3 = sc.nextInt();
     		
     	printLargestNumber(number1, number2, number3);
     	sc.close();

	}

}
