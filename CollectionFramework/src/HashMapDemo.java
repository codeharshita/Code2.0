import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// No-order -> No indexing.
		// stores values -> in the form of <key,value> pair <K,V>.
		// key can not be duplicate it should be unique.
		// You can have n number of null elements as a key as well as values.
		// If the key have the same value then the latest value will be printed.

		HashMap<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1, "Bus");
		studentMap.put(2, "Walking");
		studentMap.put(3, "Bus");
		studentMap.put(4, "Walking");
		// studentMap.put(5, "Bus");
		studentMap.put(5, "Bus Driver Heavy Driver");
		studentMap.put(null, "Vehicle");
		// studentMap.put(null, "Walking Vehicle");

		// Fetch the data -> Get the data.
//		System.out.println(studentMap.get(2));
//		System.out.println(studentMap.get(3));
//		System.out.println(studentMap.get(10));
//		System.out.println(studentMap.get(5));
//		System.out.println(studentMap.get(null));
//		System.out.println();

		// Iterating the HashMap
		Iterator<Integer> itr = studentMap.keySet().iterator();
		Integer r = itr.next();
		String val = studentMap.get(r);
		System.out.println("Key" + " = "+ r + "," + "Value" +" = "+ val);
	}

}
