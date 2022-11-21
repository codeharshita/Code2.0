abstract class KFC{
	KFC(){
		System.out.println("This is my KFC Outlet. ");
	}
	
	void makeItem() {
		System.out.println("Make a Ham Grill Burger.");
	}
	
	abstract void billing();
	abstract void offer();
}

class MyKfc extends KFC{
	@Override
	public void billing() {
		System.out.println("Billing is in process");
	}
	
	public void offer() {
		System.out.println("Offer is limited.");
	}
	
}

public class MyRestaurant {

	public static void main(String[] args) {
		KFC k = new MyKfc();
		k.makeItem();
		k.billing();
		k.offer();

	}

}
