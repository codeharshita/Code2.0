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
		
		
		@SuppressWarnings("deprecation")
		Utensils obj1= (Utensils)Class.forName("JavaBasics.Utensils").newInstance();
		System.out.println(obj1.color);
		System.out.println(obj1.name);
		System.out.println(obj1.handlesKadhai);
		
		
	
	}

}
