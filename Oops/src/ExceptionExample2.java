
public class ExceptionExample2 {

	public static void main(String[] args) {
		
		
		int A[] = {30,20,10,0};
		
		try {
		int res = A[0]/A[4];
		System.out.println("The result is "+ res);
//		int res2 = A[0]/A[4];
//		System.out.println(res2);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Invalid"+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid element.");
		}finally 
		{
			System.out.println("Program is executed.");
		}
	}

}
