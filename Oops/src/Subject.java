
  class Subject {
	  
	 
     private String subID;
	 private String name;
	 private int maxMarks;
	 private int marksObtain;
	  boolean isQualified;
	 
	 public Subject(String name, String subID) {
		 this.name= name;
		 this.subID=subID;
	 }
	 
	 public String getSubID(String subID) {
		 return this.subID;
		 }
	 public String getName(String name) {
		 return this.name;
	 }
	 public int getMaxMarks(int maxMarks) {
		 return this.maxMarks;
	 }
	 public int getMarksObtain(int marksObtain) {
		 return this.marksObtain;
	 }
	 
	 public void setMaxMarks(int mm) {
		 maxMarks=mm;
	 }
	 public void setMarksObtain(int m) {
		 marksObtain=m;
	 }
	 
	 boolean isQualified() {
		 return marksObtain>=maxMarks/10*4;
	      }
	 
     public String toString() {
    	 return "\nSubject ID: "+subID+"\nName:"+name+"\nMarks Obtained:"+marksObtain;
     }
     
  
 }

	 
	 
	 
	 

	

