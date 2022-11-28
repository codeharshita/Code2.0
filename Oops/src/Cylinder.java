
// Data hiding concept.
import java.util.*;
class CylinderTest{
	
	private double radius;
	private double height;
	
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setRadius(double r) {
		if(r>0) {
			radius =r;
		}else {
			System.out.println("Invalid input.");
		}
	}
	
	public void setHeight(double h ) {
		if(h>0) {
			height = h;
		}else {
			System.out.println("Invalid input.");
		}
		
	}
	
	public double calcArea() {
		return 2*Math.PI*radius*height + 2 * Math.PI*radius*radius;
	}
}
public class Cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius.");
		double d = sc.nextDouble();
		CylinderTest cd =  new CylinderTest();
		cd.setRadius(d);
		System.out.println(cd.getRadius() + " is the radius.");
		System.out.println("Enter the height.");
		double m = sc.nextDouble();
		cd.setHeight(m);
		System.out.println(cd.getHeight()+ " is the height. ");
		
		System.out.println();
		
		System.out.println("The area of the cylinder is " + cd.calcArea());
		sc.close();
		
	}

}
