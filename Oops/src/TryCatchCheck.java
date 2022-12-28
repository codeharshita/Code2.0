
public class TryCatchCheck {

	public static void main(String[] args) {
		
		
		try {
			int arr[] = {1,3,5,7};
			int a =arr[0];
			int d = 0;
			int m = a/d; // will throw exception here.
			int b = arr[10]; //will throw exception
			
			int c= b/a;
			
			System.out.println(m);
			System.out.println(c);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid array element");
		}catch(ArithmeticException e) {
			System.out.println("Enter valid number."+ e.getMessage()+" "+ e);
		}

	}

}
