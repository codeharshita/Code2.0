class My{
	static {
		System.out.println("Block 4.");
	}
	static {
		System.out.println("Block 5.");
	}
}



public class StaticPractise {
	//implementing static block.
	//All the static block will be introduced first then the main method.
	static {
		System.out.println("Block 1");
	}
	
	static {
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("Main");
	}
	
	static {
		System.out.println("Block 3");
	}

}
