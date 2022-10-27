
public class Lamp {
	
	boolean isOn ;
	
	void turnOn() {
		isOn= true;
		System.out.println("Is lamp on? "+ isOn);
	}
	
	void turnOff() {
		isOn=false;
		System.out.println("Is lamp off? " + isOn);
	}

	public static void main(String[] args) {

		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		led.turnOn();
		halogen.turnOff();

	}

}
