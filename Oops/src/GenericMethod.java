class MyGenericMethod {

	public <T> void genericsMethod(T data) {
		System.out.println("Java programming");
		System.out.println("Hello world." + data);

	}

}

public class GenericMethod {

	public static void main(String[] args) {
		MyGenericMethod demo = new MyGenericMethod();
		demo.<String>genericsMethod("Generics Method.");
		demo.<Integer>genericsMethod(25);
	}

}
