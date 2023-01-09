import java.util.ArrayList;
public class CollectionFrame1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Horse");
		arrayList.add("Elephant");
		arrayList.add("Tiger");
		arrayList.add("Cheetah");
		arrayList.clear();
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		System.out.println(arrayList.getClass());
		//arrayList.ensureCapacity(4);
		System.out.println(arrayList);
		
		System.out.println("Before Cloning "+ arrayList);
		
		@SuppressWarnings("unchecked")//WHY?
		//Clone is a method in arrayList which is used to create a shallow copy of the previous defined array.
		// There will be no changes in the cloned arrayList if you modify something from the original array. 
		ArrayList<String> arrayListClone = (ArrayList<String>)arrayList.clone();
		System.out.println("After Cloning "+ arrayListClone);
		
		arrayList.add("Lion");
		
		System.out.println();
		System.out.println("Before Cloning "+ arrayList);
		System.out.println("After Cloning "+ arrayListClone);
		
	}

}
