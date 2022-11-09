
public class Car {

	String name;
	int model;
	String color;
	
	public Car(String name, int model, String color) {
		this.name=name;
		this.model=model;
		this.color=color;
		
	}
	
	
	public static void main(String[] args) {
	Car obj1 = new Car("BMW", 2015, "Magenta-Pink");
	Car obj2 = new Car("Ferrari", 2018, "Black");
	Car obj3 = new Car("Hyundai", 2014," White");
	
	// Fetching the details.
	System.out.println(obj1.name+ " " + obj1.model + " "+ obj1.color );
	System.out.println(obj2.name+  " "+ obj2.model + " "+ obj2.color);
	System.out.println(obj3.name+ " " + obj3.model+ " "+ obj3.color);
	
		
	}
}
