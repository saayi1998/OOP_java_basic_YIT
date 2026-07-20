class Student{
	String fname;
	String lname;
	
	Student(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	String getFullname(){
		String Fullname=this.fname+this.lname;
	}
	
	void display(){
		System.out.println("First name:"+this.fname);
		System.out.println("last name:"+this.lname);
		//System.out.println("Full name:"+this.Fullname);
	}
}

