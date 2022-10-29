//Head- Recursion.
public class Recursion2 {
	
	static void fun(int m) {
		if(m>0) {
			fun(m-1);
			System.out.println(m);
		}
	}
	

	public static void main(String[] args) {
		int m = 5;
		fun(m);
	}

}
