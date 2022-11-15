// Concept of multiple classes.
 public class Main {

	public static void main(String[] args) {
		Admin a = new Admin("Samaira","Office admin");
		System.out.println("Name: "+ a.name+"\nProfession: "+ a.profession);
		a.setAge(27);
		a.setEmail("Sam34yji@gmail.com");
		a.setId(4);
		a.setSalary(50000);
		
		System.out.println("Age: "+a.getAge()+"\nEmail: "+a.getEmail()+"\nID: "+a.getId()+"\nSalary: "+ a.getSalary());
		
		
	}

}
