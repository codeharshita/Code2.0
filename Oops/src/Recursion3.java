import java.util.*;
public class Recursion3 {
	public static int printFact(int n) {
		if(n == 0)return 1;
		else {
			return n*printFact(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(printFact(n)+ " is the factorial of " + n);
		sc.close();
		System.exit(0);

	}

}
