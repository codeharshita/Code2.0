//Understanding class.
public class Bicycle {
	
	//field
	public static int wheels = 2;
	
	// method.
	public static void stop() {
		System.out.println("Stop!");
	}
	

	public static void main(String[] args) {
		System.out.println("The bicycle has "+ wheels + " wheels.");
		stop();
		//System.out.println(stop());

	}

}
