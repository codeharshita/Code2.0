import java.util.*;

class Kid{
	String name;
	int age;
	//Constructor can also throw exception.
	public Kid() throws InputMismatchException {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your name");
		this.name = sc.next();
		System.out.println("Enter your age.");
		this.age = sc.nextInt();
		sc.close();
		
	}
}
public class ConstructorException {

	public static void main(String[] args) {
		//While creating an object an exception can occur here too.
		try {
		Kid kid1 = new Kid(); 
		}
		catch(InputMismatchException ex) {
			System.out.println("Enter valid input.");
		}
		
		
		

	}

}
