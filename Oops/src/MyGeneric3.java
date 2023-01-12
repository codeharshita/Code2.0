class MyArray<T>{
	
	
	// Initilaize an array of generic type
	
	@SuppressWarnings("unchecked")
	T A[]  = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v) {
		A[length++] = v;
	}
	
	public void display() {
		for(int i = 0; i<length; i++) {
			System.out.println(A[i]);
		}
	} 
	
}


public class MyGeneric3 {

	public static void main(String[] args) {
		MyArray<String> myArray = new MyArray<>();
		myArray.append("This");
		myArray.append("Is");
		myArray.append("Me");
		
		myArray.display();

	}

}
