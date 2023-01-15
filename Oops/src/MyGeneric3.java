class MyArray<T extends Number> {

	// Initilaize an array of generic type

	@SuppressWarnings("unchecked")
	T A[] = (T[]) new Object[10];
	int length = 0;

	public void append(T v) {
		A[length++] = v;
	}

	public void display() {
		for (int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}
	}

}

public class MyGeneric3 {

	public static <E> void print(E[] list) {
		for (E x : list) {
			System.out.println(x);
		}

	}

	public static void main(String[] args) {
		MyArray<Float> myArray = new MyArray<>();
		myArray.append(10.3f);
		myArray.append(29.4f);
		myArray.append(76.2f);
		myArray.append(112.1f);

		myArray.display();

		print(new String[] { "HII", "JAVA", "Language." });

	}

}
