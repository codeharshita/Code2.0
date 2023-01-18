/**
 * Functional Interface are those interface which consists of only one abstract
 * method.
 * 
 */

@FunctionalInterface

interface MyLambda {
	public void display();
}

interface MyNewLambda {
	public int sum(int a, int b);
}

interface PrintThis {
	public void print(String s);
}

interface SumIt {
	public int add(int c, int d);
}

/*
 * class World implements MyLambda{ public void display() {
 * System.out.println("This is my world."); }
 * 
 * }
 */

public class LambdaExp {

	public static void main(String[] args) {
		// Lambda Expression.
		MyLambda m = () -> {
			System.out.println("This is my new World.");
		};

		m.display();

		MyNewLambda m1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		// m1.sum(3,2);
		System.out.println(m1.sum(3, 2));

		PrintThis ptr = (s) -> {
			System.out.println(s);
		};

		System.out.println("Hello, I am Lambda Expression.");

		SumIt sn = (a, b) -> a + b;
		int r = sn.add(30, 20);
		System.out.println(r);

	}

}
