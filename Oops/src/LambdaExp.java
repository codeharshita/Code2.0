/**
 * Functional Interface are those interface which consists of only one abstract method.
 * 
 * */

@FunctionalInterface

interface MyLambda{
	public void display();
}

interface MyNewLambda{
	public int sum(int a , int b);
}


/*class World implements MyLambda{
	public void display() {
		System.out.println("This is my world.");
	}
	
}*/

public class LambdaExp {

	public static void main(String[] args) {
		//Lambda Expression.
		MyLambda m = ()-> {
				System.out.println("This is my new World."); 
			      };
			
		
		m.display();
		
		MyNewLambda m1 = (int a, int b)->{
			int c = a+b;
			return c;
		};
		//m1.sum(3,2);
		System.out.println(m1.sum(3, 2));
		
		

	}

}
