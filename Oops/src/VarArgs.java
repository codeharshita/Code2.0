/**
 * In java, there is a concept of varArgs
 * where varArgs stands for variable arguments
 * We can put as many as parameters or arguments we want 
 * in a method.
 * */
public class VarArgs {
	
	static void show(int...A) {
		for(int i :A) {
			System.out.println(i);
		}
	}
	
	static void showList(String ...s) {
		for(int i =0; i<s.length; i++) {
			System.out.println(i+1 + "."+ s[i]);
		}
	}
	
	

	public static void main(String[] args) {

		showList("Bishan", "Veena", "Varun", "Lucy", "Gaurav", "Shehnaz");
		
		show();
		show(10,30,40);
		System.out.println();
		show(89,44,2,21,56,90);
	}

}
