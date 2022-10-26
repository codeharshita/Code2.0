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
	public static int wheels = 2;
	
	// method.
	//We use static to save memory.
	public static void stop() {
		System.out.println("Stop!");
	}
	

	public static void main(String[] args) {
		System.out.println("The bicycle has "+ wheels + " wheels.");
		stop();
		//System.out.println(stop());-> not applicable because it is 

	}

}
