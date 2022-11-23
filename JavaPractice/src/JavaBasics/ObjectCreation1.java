package JavaBasics;


//Concrete Class.
class Furniture{
	
	//Non-static variable so object creation is a must .
	String name= "Sofa";
	int wheels=4;
	String color = "Pinkish Brown";
	
	//Non-static method.
	public void changeColorSofa() {
		System.out.println("The sofa color was changed to yellow. ");
	}
	
}

public class ObjectCreation1 {

	public static void main(String[] args) {
		// Type-1 Created object by using new keyword.
		Furniture f =  new Furniture();
		System.out.println(f.name);
		System.out.println(f.wheels);
		System.out.println(f.color);
		f.changeColorSofa();
		
		
		

	}

}
