// Recursive  function.
// Tail-Recursion.
public class Recursion1 {
  static void fun(int n ) {
		
	  //base condition.
		if(n==0) {
			return;
			}
		{
			System.out.print(n + " ");
			fun(n-1);// Recursive method  
		}
		
	}
	

	public static void main(String[] args) {
		int n = 5;
		fun(n);// Recursive method calling.
		

	}

}
