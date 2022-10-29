// Recursive  function.
// Tail-Recursion.
public class Recursion1 {
  static void fun(int n ) {
		
	  //base condition.
		if(n>0) { 
			System.out.println(n);
			fun(n-1);// Recursive method  
		}
		
	}
	

	public static void main(String[] args) {
		int n = 3;
		fun(n);// Recursive method calling.
		

	}

}
