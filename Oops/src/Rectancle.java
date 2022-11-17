//this a reserved keywod in java which is used to refer the current object.
public class Rectancle {
	//class variables
	int length;
	int breadth;
	
	
	// We can use this keyword to deal with the name conflicts.
	Rectancle (int l, int b){//formal parameters.
		this.length= l;
		this.breadth=b;
	}
	 
	public void display() {
		System.out.println("Length is "+ length+" cm");
		System.out.println("Breadth is "+ breadth+" cm");
	}
	
	public int area() {
		return length*breadth;
	}

	public static void main(String[] args) {
		Rectancle r1=new Rectancle(5,2);//actual parameters
		r1.display();
		System.out.println("Area of rectangle is "+r1.area()+" cm sq.");

	}

}
