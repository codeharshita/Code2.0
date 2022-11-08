
public class Student {
	
	int rollNo;
	String name;
	String courseName;
	int sub1,sub2,sub3,sub4,sub5;
	
	
	public void printTotal() {
		System.out.println(" The total of subjects is printed.");
	}

	public void printAverage() {
		System.out.println(" Print the average.");
	}
	
	
	public static void main(String[] args) {
		Student ram = new Student();
		ram.printAverage();
		ram.printTotal();
		System.exit(0);

	}

}
