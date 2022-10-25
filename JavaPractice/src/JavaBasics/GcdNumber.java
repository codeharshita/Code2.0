// Write a method to calculate the GCD of the two numbers.
package JavaBasics;

public class GcdNumber {

	public static int findGcd(int m , int n) {
		
		while(m != n) {
			if(m>n) {
				m=m-n;
			}else {
				n=n-m;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		System.out.println(" GCD is " + findGcd(25,15));

	}

}
