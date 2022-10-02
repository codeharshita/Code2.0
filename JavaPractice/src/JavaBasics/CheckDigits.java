package JavaBasics;
import java.util.*;

public class CheckDigits {
	public static int checkDigits(int number) {
		
			int count = 0;
			while(number > 0) {
				number = number/ 10;
				count++; //why not count = count++?? 
			}
			return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = sc.nextInt();
		
		System.out.println();
		System.out.println("The total number of digits are: "+checkDigits(number));
		sc.close();
				
	}

}
