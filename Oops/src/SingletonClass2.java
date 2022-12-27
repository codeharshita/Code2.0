class Database{
	
	
	private static Database dbObject= null;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if(dbObject == null)
			dbObject=new Database();
		    return dbObject;
	}
	
	public void getConection() {
		System.out.println("You are connected to the database.");
	}
	
}




public class SingletonClass2 {

	public static void main(String[] args) {
	Database d1 = Database.getInstance();
	d1.getConection();

	}

}
