/** 
 * @author hp
 * @version 2.0
 * @since 2022
 * */



	/**
	 * @author hp
	 * Class for Animals
	 */
public class Animals {
	
	//instance variables.
	
	/**
	 * {@value 4 for number of legs.}
	 * */
	int numberOfLegs =4;
	int eyes = 2;
	String color = "YellowishBrown";
	String  name;
	/**
	 * Parameterized Constructor 
	 * @param Animal Name 
	 * */
	public Animals(String s) {
	this.name=s;
	}
	
	/**
	 * Calculate the distance of the tiger from the forest.
	 * @param roll is the average distance.
	 * @throws Exception if the result is negative...it will throw the Exception.   
	 * */
	
	public void distance (int roll) throws Exception{
		
	}

	public static void main(String[] args) {
		Animals tiger = new Animals("This is an animal."); 
		System.out.println(tiger);
		System.out.println("This breed of tiger has "+ tiger.numberOfLegs + " legs.");
		System.out.println("It has "+tiger.eyes+" eyes.");
		System.out.println("The skin shade is "+ tiger.color+" color.");
		System.exit(0);
		
	}

}
