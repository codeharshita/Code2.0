import java.util.*;

class MyNewComp implements Comparator<Integer>{
	
	
	public int compare(Integer o, Integer y) {
		if(o>y) {
			return 1;
		}else if(o<y) {
			return -1;
		}else {
			return 0;
		}
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		int[] a = {2,3,1,5,6,7};
		int[] a2 = {2,3,1,5,6,7,9};
		
		
		int[] c = Arrays.copyOf(a2, a2.length);
		//Arrays.sort(c, new  MyNewComp() );
		
		Arrays.sort(c);
		//Arrays.fill(c, 23);

		for(int x:c)
			System.out.println(x);
		
		System.out.println();
		System.out.println(Arrays.compare(a, a2));
	}

}
