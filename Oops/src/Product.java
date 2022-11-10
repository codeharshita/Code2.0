// Acheiving data security of the class by adding getter an d setter methods.
public class Product {
	
	 String itemName;
	private double price;
	int qty;
	
	//getter
	
	public double getPrice() {
		return this.price;
	}
	
	//setter
	public void setPrice(double price) {
		if(price<150) {
			System.out.println("You have bought the product.");
		}else {
			System.out.println("Select the required range.");
		}
		
		
		
		this.price= price;
	}
	
	
	
	
	public void display() {
		System.out.println(this.itemName);
		System.out.println(this.price);
		System.out.println(this.qty);
	}
	

		
		
	

}
