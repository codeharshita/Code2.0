import java.util.*;
public class CollectionFrame3 {

	public static void main(String[] args) {
		ArrayList <Integer> arrayList = new ArrayList<>(5);
		arrayList.add(32);
		arrayList.add(42);
		arrayList.add(76);
		arrayList.add(12);
		arrayList.add(87);
		
//		Iterator<Integer> iterator = arrayList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		System.out.println();
//		ListIterator<Integer> it =  arrayList.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.nextIndex());
//		}	
		//arrayList.forEach(n -> System.out.println(n));
		arrayList.forEach(n->show(n));
		
		}
	public static int show(int n) {
		if(n>60) {
			System.out.println(n);
		}
		return n;
	}

}
