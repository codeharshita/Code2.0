import java.util.*;

public class IteratorArray {

	public static void main(String[] args) {

		ArrayList<String> iterate = new ArrayList<>();
		iterate.add("Cow");
		iterate.add("Elephant");
		iterate.add("Fox");
		iterate.add("Dog");

		// Iterator<String> myIterator = iterate.iterator();

//		while (myIterator.hasNext()) {
//
//			String word = myIterator.next();
//			System.out.print(word+ " : ");
//
//			// accessing the index
//			System.out.println(iterate.indexOf(word));
//		}

		
		//For accessing the elements of an use always use .get method.
		for (int i = 0; i < iterate.size(); i++) {
			System.out.println(iterate.get(i));
		}

	}

}
