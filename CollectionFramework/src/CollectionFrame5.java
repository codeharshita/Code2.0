import java.util.*;
public class CollectionFrame5 {

	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList<>();
		
		ll.add(34);
		ll.add(56);
		ll.addFirst(1);
		ll.addLast(9);
		
		
		for(Integer i : ll)
		System.out.println(i);
	
		System.out.println();
		
		System.out.println(ll);
 
	}

}
