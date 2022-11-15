class Circle{
	
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double perimeter() {
		return circumference();
	}
	
	
}

class Cylinder2 extends Circle{
	public double height;
	 
	
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}




public class Circle1 {

	public static void main(String[] args) {
			
			Cylinder2 c= new Cylinder2();
			c.radius=5;
			c.height=4.5;
			
			System.out.println("Area of circle: "+ c.area());
			System.out.println("Volume of cylinder: "+ c.volume());
	}

}
