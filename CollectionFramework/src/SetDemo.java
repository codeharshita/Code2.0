import java.util.*;

@SuppressWarnings("rawtypes")
class Point implements Comparable{
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x:" + x +","+ "y:" + y;
	}

	public int comapreTo(Object o) {

		Point p = (Point) o;

		if (this.x < p.x) {
			return -1;
		} else if (this.x > p.x) {
			return 1;
		} else if (this.y < p.y) {
			return -1;
		} else if (this.y > p.y) {
			return 1;
		} else
			return 0;

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Point> obj = new TreeSet<>();
		obj.add(new Point(1, 1));
		obj.add(new Point(5, 5));
		obj.add(new Point(5, 2));

		 System.out.println(obj);

	}

}
