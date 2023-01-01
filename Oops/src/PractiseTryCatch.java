
//Defined own exception class.
class LowBalanceException extends Exception{
	//this method is overrided from Exception Class.
	@Override
	public String toString() {
		return "Balance can't be less than 5000.";
	}
	//this method is overrided from Exception Class.
	public String getMessage() {
		return "Now not null.";
	}
}
public class PractiseTryCatch {
	static void fun1() {
		try {
		throw new LowBalanceException();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	static void fun2() {
		fun1();
	}
	static void fun3() {
		fun2();
	}

	public static void main(String[] args) {
		fun1();
		

	}

}
