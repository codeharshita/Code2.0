class Rectanckle{
	int length;
	int breadth;
	int x=10;
	
	Rectanckle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
}

class Cuboid extends Rectanckle{
	int height;
	int x=20;
	
	Cuboid(int l, int b,int h){
		//super keyword is used to refer the members of the parent/super class.
		super(l,b);
		this.height=h;
		int x = 20;
 }
	
	public void display() {
		System.out.println(super.x);
		System.out.println(x);
	}
	
}

public class thisSuper {
	
	public static void main(String[] args) {
		Cuboid c1 = new Cuboid(2,3,4);
		c1.display();



	}

}
