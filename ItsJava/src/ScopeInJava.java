/**
 * Scope are the region of variable 
 * where it is declared.
 * 
 * There are two types of scope
 * 1->Method Scope.
 * 2->Block Scope. 
 * */
public class ScopeInJava {

	public static int add(int d, int m) 
	//Method scope -> Variables declare inside the curly braces.
	{
		return d+m;
	}
	
	
	public static void main(String[] args) { // Block scope-> Variables declared within the block. 
		int a =5; 
		int b = 6;
		int c = a+b;
		
		System.out.println(c);
		System.out.println(add(4,3) + " is the result.");
	}
	//int c = a+b; Out of scope(region).

}
