// seperate class to access in the other class called main.java
public  class Admin {

	//instance variable.
	 String name;
	 String profession;
	 private int age;
     private double salary;
     private int ID;
     private String email;
    
    public Admin(String name,String profession) {
    	this.name= name;
    	this.profession= profession;
    	
    }
    
    //Getter methods
     public int getAge() {
    	return age;
    }
     
     public double getSalary() {
    	 return salary;
     }
     public int getId() {
    	 return ID;
     }
    
     public String getEmail() {
    	 return email;
     }
     
     //Setter methods.
     
     public void setAge(int age) {
    	 this.age=age;
    }
     public void setSalary(double salary) {
    	 this.salary=salary;
     }
     public void setId(int ID) {
    	 this.ID=ID;
     }
     public void setEmail(String email) {
    	 this.email=email;
     }
     
	

}
