// understanding generics.

//DATA HIDING
class DataNew<T>{
	//Making the variable private.
	private T obj;
	
	
	// Property methods -> Using getter and setter method.
	//setting the  data using logic.
	public void setData(T v) {
		obj = v;
		
	}
	
	//getting or retrieving the data using return.
	 public T getData() {
		return obj;
	}
	
		
}

public class MyGeneric2 {
	

	public static void main(String[] args) {
		// Generic type Integer only.
		DataNew<Integer> data =new DataNew<>();
		data.setData(43);
		
		System.out.println(data.getData());
		

	}

}
