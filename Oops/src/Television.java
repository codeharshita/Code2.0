
public class Television {
	
	int channel;
	String name;
	
	void changeChannel() {
		System.out.println("The channel is changed.");
	}

	public static void main(String[] args) {
		
Television t1 = new Television();
t1.changeChannel();
	}

}
