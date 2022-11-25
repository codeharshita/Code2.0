package JavaBasics;

/**ASCII stands for American Standard Code for Information Interchange.
 * It is a 7-bit character set ranging from(0 to 7).
 * It tells about the numerical value of all the characters(for example all characters on the keyboard.)
 */

public class AsciiValue {

	public static void main(String[] args) {
		for(int i = 65; i<125; i++) {
			System.out.println("ASCII value of "+(char)i + " : " + i);
		}
		

	}

}
