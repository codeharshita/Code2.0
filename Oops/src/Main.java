// Concept of multiple classes.
 public class Main {

	public static void main(String[] args) {
		Admin ad = new Admin();
		User uname= new User();
		
		System.out.println("Printing admin details");
		System.out.println(ad.emailid);
		System.out.println(ad.name);
		System.out.println(ad.profession);
		System.out.println(ad.age);
		
		System.out.println();
		System.out.println("Printing user details.");
		System.out.println(uname.name);
		System.out.println(uname.location);
		System.out.println(uname.emailid);
		System.out.println(uname.id);
		System.out.println(uname.age);
		

	}

}
