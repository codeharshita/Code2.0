

class Animal{
	
	//Non-static class.
	class Mammal{
		public void display() {
			System.out.println("I am a Mammal.");
		}
	}
	
	//Static class.
	static class Reptile{
		//We can access non-static members in static class.
		int legs = 8;
		public void show() {
			System.out.println("I am a Reptile");
		}
	}
	
	int legs = 10;
	String name;
	public void show() {
		System.out.println("All these are animals.");
	}
	
	public void printName(String name) {
		System.out.println(name);
	}
	
	public void showLegs(int legs) {
		if(legs > 0) {
			System.out.println("It is an animal");
		}else {
			System.out.println("It is not a Reptile");
		}
	}
}
public class Creature {

	public static void main(String[] args) {
		
		//Accessing the outerclass.
		Animal a1 = new Animal();
		a1.printName("Octopous");
		System.out.println(a1.legs);
		a1.show();
		a1.showLegs(0);
		
		System.out.println();
		
		//Accesing the inner static class.
		Animal.Reptile r1 = new Animal.Reptile();	
		r1.show();
		System.out.println(r1.legs);
		
		//Accessing the inner non-static class
		Animal a2 = new Animal();
     	Animal.Mammal mammal =  a2.new Mammal();
		//Animal.Mammal m1 =  a2.new Mammal();
	
		
		
		
		

	}

}
