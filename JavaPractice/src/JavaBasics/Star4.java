// Solid rectangle star pattern. 
package JavaBasics;
import java.util.*;


public class Star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int n = sc.nextInt();
		int m = sc.nextInt();
				for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print("* ");
			}
			System.out.println("*");
			sc.close();
		}

	}

}
