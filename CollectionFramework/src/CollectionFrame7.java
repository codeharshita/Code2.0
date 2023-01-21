import java.util.*;

class MyComp implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2)
			return 1;
		if (o1 > o2)
			return -1;
		return 0;
	}
}

public class CollectionFrame7 {

	public static void main(String[] args) {

		PriorityQueue<Integer> obj = new PriorityQueue<>(new MyComp());
		obj.add(20);
		obj.add(10);
		obj.add(30);
		obj.add(5);

		obj.add(15);
		obj.add(3);
		obj.add(40);

		System.out.println("The first element is:" + obj.peek());

		obj.forEach((x) -> System.out.println(x));

		System.out.println("After deletion:" + obj.poll());

		obj.forEach((x) -> System.out.println(x));
	}

}
