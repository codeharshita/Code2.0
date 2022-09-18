package JavaBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		//show if n is a prime  number or not?
		int n = 13;
		boolean isPrime = true;
		
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				isPrime= false;
				break;
			}
		}
		
		System.out.println(isPrime);
			
		}
			
		

	

}
