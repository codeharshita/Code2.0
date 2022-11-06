// A multi-class program.

class Rectangle{
	int length;
	int breadth;
	
	public int area() {
		return length*breadth;
	}
	
	public int peri() {
		return 2*(length+breadth);
	}
}



class Test2 {
	int l =6;
	int b = 5;

	public static void main(String[] args) {
			Rectangle r = new Rectangle();
			
			r.length=5;
			r.breadth=3;
			
			System.out.println(r.area());
			System.out.println(r.peri());
			System.exit(0);

	}

}
