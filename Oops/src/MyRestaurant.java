abstract class KFC{
	KFC(){
		System.out.println("This is my KFC Outlet. ");
	}
	
	void makeItem() {
		System.out.println("Make a Ham Grill Burger.");
	}
	
	//Here is our 50% abstraction
	abstract void billing();
	abstract void offer(); // 50% of the abstraction is achieved.
}


// Child class is providing the implementation of the method so the main abstraction is achieved in the parent class.
class MyKfc extends KFC{
	@Override
	public void billing() {
		System.out.println("Billing is in process");
	}
	
	//The body under the curly braces applies it's implementation.
	  
	 
	public void offer() {
		System.out.println("Offer is limited.");
	}
	
}

public class MyRestaurant {

	public static void main(String[] args) {
		//Dynamic method dispatch - we have achieved runtime polymorphism also.
		KFC k = new MyKfc();
		k.makeItem();
		k.billing();
		k.offer();

	}

}
