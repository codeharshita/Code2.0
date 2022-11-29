package JavaBasics;

class Bottle{
		String color ="Green";
		int cover = 1;
		String shape = "Cylinder";
		
		
}

class Sprite extends Bottle{
	int litre = 300;
	boolean isAlcoholic = false;
	
	
	public static void printLabel() {
		System.out.println("This is a Sprite Bottle.");
	}
	
	public void speakSpriteTag() {
		System.out.println("Clear hai.");
	}
	
}


public class Plastic {

	public static void main(String[] args) {
		
		Sprite s = new Sprite();
		System.out.println(s.color+" "+ s.cover + " "+ s.shape);
	
		System.out.println();
		
		System.out.println(s.litre+" "+ s.shape );

	
		Sprite.printLabel();
	
		s.speakSpriteTag();

	}

}
