
public class Main2 {

	public static void main(String[] args) {
		Product pt = new Product();
		pt.itemName="Vaseline body lotion.";
	
		pt.qty=3;
		
		pt.setPrice(100000);
		Bike n = new Bike("Honda", 4,"XZ45801","White",true);
		System.out.println(n.color);
		System.out.println(n.model);
		System.out.println(n.name);
		System.out.println(n.wheels);
		System.out.println(n.isActive);

		
	}

}
