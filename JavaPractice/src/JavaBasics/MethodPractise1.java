// Write a program for method overloaded for areas.
package JavaBasics;

public class MethodPractise1 {
	//calculate area of rectangle.
	public static int area(int l,int b) {
		return l*b;
	}
	
	//calculate area of circle.
	public static double area(double radius) {
		return Math.PI*radius*radius;
	} 
	

	public static void main(String[] args) {

		System.out.println("Area of rectangle is "+ area(3,2));
		System.out.println("Area of circle is " + area(4));
		System.exit(0);

	}

}
