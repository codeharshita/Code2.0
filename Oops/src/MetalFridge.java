class Fridge{//superclass
	String color ="White";
	
	public void pressButton() {
		System.out.println("The freezer is opened by pressing button.");
	}
}

class DigitalFridge extends Fridge{//subclass
	
	
	//Method overriding .
	@Override
	public void pressButton() {
		System.out.println("The freezer is opened by face-lock.");
	}
}
public class MetalFridge {

	public static void main(String[] args) {
		DigitalFridge df = new DigitalFridge();
		System.out.println(df.color);
		//The method will be displayed from the digitalfridge.
		df.pressButton();
		
		Fridge f1 = new Fridge();
		f1.pressButton();
		
		Fridge f2 = new DigitalFridge();// The method of DigitalFridge wii be called.
		f2.pressButton();
		
			
		
		

	}

}
