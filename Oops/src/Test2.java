// A multi-class program.
/**
 * A class rectangle is made with attributes/fields/variables 
 * and the function/method.
 * */
class Rectangle{
	
	// Global variables.
	public int length;
	public int breadth;
	
	//  method to calculate the area.
	public int area() {
		return length*breadth;
	}
	
	// method to calculate the perimeter.
	public int peri() {
		return 2*(length+breadth);
	}
}



class Test2 {
	int l =6;
	int b = 5;

	public static void main(String[] args) {
		/**
		 * r is the object reference variable.
		 * new Rectangle() is the object of Rectangle class created which is stored inside the heap memory of java
		 * 
		 * t is the object reference variable.
		 * new Tesy2() is the object created which is stored inside the heap memory of java
		 * */
			Rectangle r = new Rectangle();
			Test2 t = new Test2();
			r.length=5;
			r.breadth=3;
		
			System.out.println(t.l);
			System.out.println(t.b);
			System.out.println(r.area()+ " is the area of the rectangle");
			System.out.println(r.peri()+ " is the perimeter of the rectangle.");
			System.exit(0);

	}

}
