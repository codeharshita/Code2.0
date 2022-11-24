package JavaBasics;

//Concrete class
class Utensils{
	
	//non-static variables.
	String name = "Kadhai";
	int handlesKadhai = 2;
	String color = "Brown";
	
}

public class ObjectCreation2 {

	
	public static void main(String[] args) throws InstantiationException,
	IllegalAccessException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		
//	@SuppressWarnings("deprecation")
//	Utensils obj = Utensils.class.newInstance();
		
		
		//.forName method is used for loading the class and .newInstanceMethod is used for creation of object. 
		/*.forName method is a static method which is present in Java.lang package in class Class itself
		 * */
		
		/*@SupressWarnings annotations are the warnings which are ignored by the compiler.
		 * */
		@SuppressWarnings("deprecation")
		Utensils obj1= (Utensils)Class.forName("JavaBasics.Utensils").newInstance();
		System.out.println(obj1.color);
		System.out.println(obj1.name);
		System.out.println(obj1.handlesKadhai);
		
		
	
	}

}
