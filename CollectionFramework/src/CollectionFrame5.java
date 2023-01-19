import java.util.*;
public class CollectionFrame5 {

	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList<>();
		
		ll.add("Hii");
		ll.add("I");
		ll.addFirst("am");
		ll.addLast("java");
		
		
		
		System.out.println(ll.size());
		
		System.out.println(" polled element "+ll.poll());
		ll.add(3, "Ruby");
		System.out.println(ll.contains("am"));	
		
		System.out.println("The last element is "+ll.peekLast());// LastBottom element
		System.out.println("Peeked element "+ll.peek()); // TopMost element
		
		
		
		for(String i : ll)
		System.out.println(i);
	
		System.out.println();
		
		System.out.println(ll);
 
	}

}
