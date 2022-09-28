/**Write a function that takes in age as input and returns
   if that person is eligible to vote or not. A person
    of age > 18 is eligible to vote.
 */
package JavaBasics;
import java.util.*;

public class Vote {
	
	public static void voteIt(int age) {
		int setAge = 18;
		
		if(age> setAge) {
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not elegible.");
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		voteIt(age);
		sc.close();

	}

}
