
public class TesrBank {

	public static void main(String[] args) {
		HDFCBank hb =new HDFCBank();
		
		hb.loan();
		hb.deposit();
		hb.savings();
		hb.cashWidthdrawal();
		
		//Achieving Dynamic Method Dispatch.
		
		Bank b = new HDFCBank();
		
            b.deposit();
            b.savings();
            b.loan();
            
	}

}
