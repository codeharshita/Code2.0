/*
 * Catching multiple exceptions in a single catch block reduces 
 * code duplication and increases efficiency.
 * **/
public class MultiCatchBlock {

	public static void main(String[] args) {
		
		try {
		int arr[] = new int[10];
		
		//throw exception
		arr[10]= 11/0; 
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
