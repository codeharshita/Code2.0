class Car2{
	public  void start() {
		System.out.println("The car is started.");
	}
	public  void accelerate() {
		System.out.println("The card is accelerated.");
	}
	
	public  void changeGear(){
		System.out.println("Manually Gear Changed.");
	}
}
class LuxuryCar extends Car2{
	
	@Override
	public void changeGear() {
		System.out.println("Automatically Gear Changed.");
	} 
	
	public void openRoof() {
		System.out.println("The roof is opened.");
	}
	
}

public class OverridingExample {

	public static void main(String[] args) {
		//Dynamic Method Dispatch -> Run-time polymorphism.
		Car2 hyundaiVerna = new LuxuryCar(); 
		//Sirf overrided and superclass method ko hi access karega Dynamic Method Dispatch.
		hyundaiVerna.accelerate();
		hyundaiVerna.changeGear();
		hyundaiVerna.start();
		
		//hyundaiVerna.openRoof();-> is not applicable.
		//why?-> because object is of childclass but it is referred from parent class variable so only parentclass properties and overriden properties are required.
		
		

	}

}
