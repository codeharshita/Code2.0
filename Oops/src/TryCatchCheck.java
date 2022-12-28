
public class TryCatchCheck {

	public static void main(String[] args) {
		
		
		try {
			int arr[] = {1,3,5,7};
			int a =arr[0];
			int b = arr[10]; //will throw exception
			int c= b/a;
			
			System.out.println(c);
			
		}catch(Exception e) {
			System.out.println("Enter valid array element"+" "+ e);
		}

	}

}
