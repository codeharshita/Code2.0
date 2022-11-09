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
		
	}
	
	public ConstructorConcept(int i, int j) { // 2 parameter.
		
	}
	
	

	public static void main(String[] args) {
		ConstructorConcept cd = new ConstructorConcept();	
			cd.name="Anupama";
			cd.age=45;
		System.out.println(cd.name + " age is "+ cd.age+ " years. ");

	}

}
