
public class Animals {
	//instance variables.
	int numberOfLegs =4;
	int eyes = 2;
	String color = "YellowishBrown";

	public static void main(String[] args) {
		Animals tiger = new Animals(); 
		System.out.println("This breed of tiger has "+ tiger.numberOfLegs + " legs.");
		System.out.println("It has "+tiger.eyes+" eyes.");
		System.out.println("The skin shade is "+ tiger.color+" color.");
		System.exit(0);
		
	}

}
