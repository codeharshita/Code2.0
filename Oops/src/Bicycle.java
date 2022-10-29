//Understanding class.
/**
 * A class is a blueprint of the object which
 * contains fields and methods.
 * 
 * fields are generally used to store data
 * methods are generally used to show the functionality on that data.
 * */
public class Bicycle {
	
	//field 
	// static variable because we used stataic keyword before the variable.
	
	/**
	 * Static variables are independent variables
	 * they can be accessed anywhere inside the class
	 * it also don't require any object to access it. 
	 * */
	public static int wheels = 2;
	
	// method.
	//We use static to save memory.
	public static void stop() {
		System.out.println("Stop!");
	}
	
	// It is also known as regular method.
	void brake() {
		System.out.println("Apply Break.");
	}
	

	public static void main(String[] args) {
		System.out.println("The bicycle has "+ wheels + " wheels.");
		Bicycle.stop();
		stop();
		stop();
		System.out.println();
		//Accessing the wheels without the object.
		System.out.println(Bicycle.wheels);
		Bicycle b = new Bicycle();
		b.brake();
		 
	}

}
