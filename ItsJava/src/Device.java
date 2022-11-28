class Calculator{
	
	byte buttons = 24;
	String name ="CASIO f-ssx9910";
	String color = "BluishGrey";
	byte battery = 2;
	
	public int calculateSum(int num1,int num2) {
		return  num1 + num2;
	}
	
	
}
class NewCalc extends Calculator{
	
	@Override
	public  int  calculateSum(int num1, int num2) {
		return num1-num2; // Changed to subtraction.
	}
	
}



public class Device {
	public static void main(String args[]) {
		
		Calculator c = new Calculator();
		System.out.println(c.calculateSum(3, 1));
		
		//Dynmic method dispatch
		Calculator m = new NewCalc();
		System.out.println(m.calculateSum(4, 5));
		System.out.println(m.name+" "+m.color);
		System.out.println(m.buttons+ " "+ m.battery);
		
		NewCalc j = new NewCalc();
		System.out.println(j.calculateSum(78, 76));
		
		
		
	}

}
