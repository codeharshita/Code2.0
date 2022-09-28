package JavaBasics;
import java.util.*;



public class LeapYear {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter any year to check the leap year.");
		int n = sc.nextInt();
		boolean isLeapYear = false;
		
		if((n%4 == 0) || (n%400 ==  0)) {
			isLeapYear = true;
		}
		
		System.out.println(isLeapYear);
		sc.close();
	}
}
