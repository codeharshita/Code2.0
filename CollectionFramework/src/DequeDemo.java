import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {

		ArrayDeque <Integer> obj1= new ArrayDeque<>();
		obj1.offerLast(32);
		obj1.offerLast(12);
		obj1.offerLast(93);
		Integer k = obj1.pollFirst();
		System.out.println("Polled out element: "+ k);
		
		
		
		System.out.println("This is my Collection Framework.");
		for(Integer i : obj1) {
			System.out.println(i);
		}
		
		System.out.println("Collection Framework");
		obj1.offerFirst(3);
		obj1.offerFirst(4);
		obj1.offerFirst(1);
		Integer s = obj1.removeLast();
		
		obj1.forEach((x)->System.out.println(x));
		System.out.println("Removed element :"+ s);
	}

}
