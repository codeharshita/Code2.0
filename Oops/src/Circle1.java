class Circle{
	
	public double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public Circle() {
		radius=2;
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
			Circle c1 = new Circle();
			Cylinder2 c2= new Cylinder2();
			System.out.println("Area: "+ c1.area()+ "\nCircumference: "+ c1.circumference()
			+"\nPerimeter: "+c1.perimeter());

	}

}
