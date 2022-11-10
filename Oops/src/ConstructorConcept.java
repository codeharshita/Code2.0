/*
 * Constructor is similar to method.It is invoked whenever the object is called 
 * of that class automatically which is also known as default constructors.
 * It does not have any return type
 * 
 * It is used to initialize the object.
 * There are three types of constructors:-
 * 1>Parameterized
 * 2>Non-parameterized.
 * 3>Default constructor. 
 * */
public class ConstructorConcept {
	//Global variables or class variables or instance variables.
	String name;
	int age;
	
	/* Can we overload constructor?
	 * 
	 * Yes java follows constructor overloading concept.
	 * */
	
	public ConstructorConcept() { //0 parameter.
		System.out.println("Default constructor is called. ");
	} 
	
	public ConstructorConcept(int i) { // 1 parameter.
		System.out.println("1 param ");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j) { // 2 parameter.
			System.out.println("2 param");
			System.out.println(i+ " "+ j);
	}
	
	public  ConstructorConcept(String name, int age ) { // local variables
			this.age = age;//this.classvar=local variable.
			this.name=name;
	}
	
	

	public static void main(String[] args) {
		ConstructorConcept cd = new ConstructorConcept();	
		ConstructorConcept obj1 = new ConstructorConcept(10,4);
		ConstructorConcept obj2 = new ConstructorConcept(6);
		ConstructorConcept obj3 = new ConstructorConcept("Tony Stark", 43);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
				
	}

}
