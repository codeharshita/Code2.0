
public class DemoString {

	public static void main(String[] args) {
		String name ="Alex Lee";
		int age= 34;
		String subject= "Java Programming";//String literal.
		String subject2="JaVa Programming";
		String subject3 ="JavA Programming";
		
		String fName="Harshita";
		String sName=" Srivastava";
		
		String firstName="Durgesh";
		String secondName=" Pawar";
		
		
		System.out.println(subject);
		//To concatenate to Strings.
		String fullName= fName.concat(sName);
		//You can use .concat method or you can use + method.
		System.out.println("Hello "+ fullName);
		System.out.println(firstName+secondName);
		
		
		//.length is used t0 calculate the length of the string.
		
		System.out.println(name+" "+ age +" "+subject );
		System.out.println(subject2.length()+" is the length of the string.");
		
		if(subject2.length() == subject3.length()) {
			System.out.println("You are studying Java Programming. ");
		}else {
			throw new IllegalArgumentException("Invalid Input");
		}

	}

}
