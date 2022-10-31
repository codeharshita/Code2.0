
public class Pokemon {
	
	String name;
	int numberOfEyes;
	int numberOfEars;
	String  color;
	

	void speak() {
		System.out.println(name + " is speaking. ");
	}
	
	void run() {
		System.out.println(name + " is running. " );
	}
	
	void attack() {
		System.out.println(name+ " is attacking. ");
	}
	
	void displayColor() {
		System.out.println(name + " is of " + color + " color");
	}
	
	
	public static void main(String[] args) {
		
		Pokemon p = new Pokemon();
		
		p.name = "PIKACHU";
		p.numberOfEyes=2;
		p.numberOfEars=2;
		p.color="YellowishOrange";
		
		p.displayColor();
		p.speak();
		p.run();
		p.attack();
		
		
		
		
	}

}
