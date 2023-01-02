

class Student32{
	public void displayName() throws ArithmeticException{
		System.out.println(4/0);
	}
}
public class ThrowsClause {

	public static void main(String[] args) {
		try {
		Student32 st1 = new Student32();
		st1.displayName();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is handled here."+ e.getMessage());
		}
		

	}

}
