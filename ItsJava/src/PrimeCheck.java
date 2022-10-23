import java.util.*;
public class PrimeCheck {

	public static boolean isPrime(int n) {
		for(int i =2; i<n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the nummber is Prime number or not..");
		int n = sc.nextInt();
		System.out.println(isPrime(n));
		sc.close();

	}

}
