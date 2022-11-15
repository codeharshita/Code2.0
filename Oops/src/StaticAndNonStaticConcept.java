
public class StaticAndNonStaticConcept {
	
	//Non-static global variable.
	String name ="TONY STARK";
	//static global variable.
	static int age = 45;
	
	//Non-static Method
	public void sendMail() 
	{
	 System.out.println("Mail Sent.");
	}
	
	//Static method.
	public static void sum() {
		System.out.println("Sum Generated.");
	}

	public static void main(String[] args) {
		//How to access the static methods and vars?
		
		//1.Direct call methodName().
		//2. Call with the help og ClassName.
		
		sum();
		StaticAndNonStaticConcept.sum();
		
		//How to access the non-static methods and vars?
		
		//Using object creation only.
		
		StaticAndNonStaticConcept a = new StaticAndNonStaticConcept();
		System.out.println(a.name);
		System.out.println(a.age);
		a.sendMail();
		
		
		/*
		 * Can I access the static methods by using object-refernce??->Yes we can access, but it is not 
		  considered as a good practise. This should be avoided.
		   a.sum();
		 * */
		a.sum();
		
		
	}

}
