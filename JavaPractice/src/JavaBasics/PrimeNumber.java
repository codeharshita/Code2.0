package JavaBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		//show if n is a prime  number or not?
		int n = 13;
		boolean isPrime = false;
		
		for (int i = 3; i<n; i+=2) {
			if(n % i != 0) {
				isPrime = true;
				break;
			}
			
		}
			
		

	}

}
