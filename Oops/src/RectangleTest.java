
public class RectangleTest {
	
	
	private int length;
	private  int breadth;
	
	public  int area() {
	  return length*breadth;
  }
	public int peri() {
		return 2*(length+breadth);
	}
	
	public boolean isSquare() {
		
		if(length==breadth) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		RectangleTest r = new RectangleTest();
		r.length=32;
		r.breadth=32;
		
		System.out.println(r.isSquare());
		System.out.println(r.area()+ " is the calcuated area.");
		System.out.println(r.peri()+ " is the calculated perimeter.");

	}

}
