class Fridge{//superclass
	String color ="White";
	
	public void pressButton() {
		System.out.println("The freezer is opened by pressing button.");
	}
	public void sendFruits() {
		System.out.println("Send fruits.");
	}
}

class DigitalFridge extends Fridge{//subclass
	
	
	//Method overriding . method name and parameters is same in both the classes but functionality is different.
	@Override
	public void pressButton() {
		System.out.println("The freezer is opened by face-lock.");
	}
	
	public void deliver() {
		System.out.println("Deliver it.");
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
		
		System.out.println();
		
		
		//Dynamic Method Dispatch.
		Fridge f2 = new DigitalFridge();// The overrided method of DigitalFridge will be called.
		f2.pressButton();//this is also defined in superclass and subclass.
		f2.sendFruits();
		
			
		
		

	}
}
/*  Reference variable of the parentclass holding the object of the childclass is known as Dynamic method dispatch.
 * It is also known as run-time polymorphism.
 * 
 * */
