class Monkey{
	String type="Spider Monkey";
	
	public static void jump() {
		System.out.println("Jump");
	}
}
public class ObjectsArray {

	public static void main(String[] args) {

		Monkey m1=new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		
		
		//Array of objects.
		Monkey[] monkeys = {m1,m2,m3};
		// To call use for-each loop
		
		for(Monkey m:monkeys) {
			m.jump();
		}
	}

}
