import java.util.*;

class HarshitaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public HarshitaException(String s ){
		super(s);
	}
}
public class UserDefinedException {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		try {
		if(num == 2) {
			throw new HarshitaException("This is Harshita Exception.");
		}
		}catch(HarshitaException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();
		
	}

}
