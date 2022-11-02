
public class Tiger {
	//instance variables.
	int numberOfLegs =4;
	int eyes = 2;
	String color = "YellowishBrown";

	public static void main(String[] args) {
		Tiger t = new Tiger();
		System.out.println("This breed of tiger has "+ t.numberOfLegs + " legs.");
		System.out.println("It has "+t.eyes+" eyes.");
		System.out.println("The skin shade is "+ t.color+" color.");
		System.exit(0);
		
	}

}
