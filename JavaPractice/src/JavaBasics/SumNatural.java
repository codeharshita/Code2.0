package JavaBasics;
import java.util.*;

public class SumNatural {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:-");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		//while loop
		while(i<=n) {
			sum = sum+i;
			i++;
			}
		System.out.println("Th sum of first " + n + " numbers is "+ sum);
		sc.close();
	}

}
