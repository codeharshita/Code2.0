class Greeting{
	public void sayHello() {
		System.out.println("Hello India.");
	}
}

class India{
	//Anonymous class calling .
	//Here, anonymous class is the subclass of Greeting. (OBSERVE->NO-NAME)
	Greeting g = new Greeting() {
	public void sayHello() {
		System.out.println("Namaste India.");
	};	
};
	
}
public class Example {

	public static void main(String[] args) {
		India india = new India();
		india.g.sayHello();

	}

}
