class StackOverflowException extends Exception
{
	

	public  String toString() {
		return "Stack is full";
	}
}

class StackUnderflowException extends Exception{
	public String toString() {
		return "Stack is empty.";
	}
}

class Stack{
	private int size;
	private int Top = -1;
	private int S[];
	
	public Stack(int sz) {
		size = sz;
		S = new int[sz];
	}
	
	public void push(int x) throws StackOverflowException{
		if(Top == size-1)
			throw new StackOverflowException();
		Top++;
		S[Top]= x;
	}
	
	public int pop() throws StackUnderflowException {
		int x = -1;
		
		if(Top == -1)
			throw new StackUnderflowException();
		x=S[Top];
		Top--;
		return x;
		
	}
}
public class UserDefinedExceptions {

	public static void main(String[] args)  {
		//Stack is full.
		Stack s1 = new Stack(5);
		try {
			
		s1.push(3);
		s1.push(2);
		s1.push(3);
		s1.push(2);
		s1.push(3);
		s1.push(2);
		}catch(StackOverflowException  so) {
			System.out.println(so);
		}
		//Stack is empty.
		Stack s2 =  new Stack(3);
		
		try {
			s2.pop();
		}catch(StackUnderflowException su) {
			System.out.println(su);
		}
		

	}

}
