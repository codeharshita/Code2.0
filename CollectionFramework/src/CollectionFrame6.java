import java.util.LinkedList;

public class CollectionFrame6 {

	public static void main(String[] args) {

		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(5);
		ll2.add(8);
		ll2.add(9);
		ll2.add(1);
		ll2.add(7);
		// elements will be always be pushed first over here then other elements.
		ll2.push(54);
		ll2.push(43);

		System.out.println(ll2.peek()); // show the first element , but will not remove
		System.out.println(ll2.peekFirst()); // also shows the first element, but not remove.
		System.out.println(ll2.peekLast()); // shows the last element or data or object, but not remove.

		for (Integer m : ll2) {
			System.out.println(m);
		}

		System.out.println(" \nPolling: ");
		System.out.println(ll2.poll());//remove the first element.
		System.out.println(ll2.pollFirst());//also removes the first element.
		System.out.println(ll2.pollLast());// also removes the last element.

//		System.out.println(ll2.push(42));
//		System.out.println(ll2.addFirst(54));
		//ll2.push(45);
		System.out.println(ll2.toString());
	}

}
