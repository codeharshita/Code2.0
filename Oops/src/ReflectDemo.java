import java.lang.reflect.Field;

class ReflectIt{
	private int a;
	public int b;
	protected int c;
	int d;
	
	public ReflectIt() {}
	
	public ReflectIt(int x, int y) {
		
	}
	
	public void display(String s1, String s2) {}
	public int show(int x, int y) {return 0;}
}
public class ReflectDemo {

	public static void main(String[] args) {
		Class c = ReflectIt.class;
		//System.out.println(c.getClass());
		Field f[] = c.getFields();
		
		for(Field f1 : f) {
			System.out.println(f1);
		}
		
		System.out.println("**********************************");
		
		ReflectIt rt = new ReflectIt();
		Class c1 = rt.getClass();
		System.out.println(c1);
		
		
		

	}

}
