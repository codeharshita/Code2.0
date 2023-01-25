import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDeque2 {

	public static void main(String[] args) {
		ArrayDeque<String> animals =  new ArrayDeque<>();
		animals.add("Horse");
		animals.add("Elephant");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Donkey");
		System.out.println(animals.peek());
		
		System.out.println();
		String rem = animals.pollLast();
		System.out.println("Removed element: "+ rem);
		
		//Iterator is an interface.
		
		Iterator<String> itr =  animals.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("");
		}
		
		
		
		
		

	}

}
