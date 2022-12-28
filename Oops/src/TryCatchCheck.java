
public class TryCatchCheck {
	
	public static void display() {
		System.out.println("Display on the screen.");
	}
	
	//Always static block executes then any other member inside a class.
	static {
		int x = 1;
		int v = 3;
		int f =  x+v;
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		TryCatchCheck.display();
		
		
		try {
			int arr[] = {1,3,5,7};
			int a =arr[0];
			int d = 0;
			int m = a/d; // will throw exception here.
			int b = arr[10]; //will throw exception
			
			int c= b/a;
			
			System.out.println(m);
			System.out.println(c);
			
			//multiple catch block can be used only with one single try block. 
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid array element");
		}catch(ArithmeticException e) {
			System.out.println("Enter valid number."+ e.getMessage()+" "+ e);
			
			//Finally block always executes in the end.
			
			//  For each try block there can be only one finally block.
			 
		}finally {
			System.out.println("Program is executed.");
		}
		

	}

}
