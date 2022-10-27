
public class Lamp {
	
	//tells whether the light is on/off.
	
	boolean isOn ;
	
	//Method - TurnOn when the light is on 
	void turnOn() {
		isOn= true;
		System.out.println("Is lamp on? "+ isOn);
	}
	
	//Method - TurnOff when the light is off. 
	void turnOff() {
		isOn=false;
		System.out.println("Is lamp off? " + isOn);
	}

	public static void main(String[] args) {

		
		//Creating objects to get the access to the methods led and halogen.
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		// Calling Method using objects created NOT STATIC.
		led.turnOn();
		halogen.turnOff();

	}

}
