class CoffeeMachine{
	private float WaterQty;
	private float SugarQty;
	private float MilkQty;
	private float CoffeeQty;
	
	
	static private CoffeeMachine myMachine = null;
	
	private  CoffeeMachine() {
		WaterQty =1;
		SugarQty = 5;
		MilkQty = 3;
		CoffeeQty = 7;
		
	}
	
	public void fillWater(float m) {
		WaterQty=m;
		System.out.println(WaterQty);
	}
	
	public void fillSugar(float s) {
		SugarQty = s;
		System.out.println(SugarQty);
	}	
	
	public void fillMilk(float m) {
		MilkQty = m;
		System.out.println(MilkQty);
	}
	
	public void fillCoffee(float c) {
		CoffeeQty = c;
		System.out.println(CoffeeQty);
	}
	static public CoffeeMachine getInstance() {
		if(myMachine == null)
			myMachine = new CoffeeMachine();
			return myMachine;
	}
	
}



public class Singleton {

	public static void main(String[] args) {
	// CoffeeMachine myMachine = new CoffeeMachine();
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		
				m1.fillWater(4);
				m1.fillCoffee(5);
				m1.fillMilk(2);
				m1.fillSugar(7);
				

	}

}
