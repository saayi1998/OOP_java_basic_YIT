class Student{
	String fname;
	String lname;
	
	Student(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	String getFullname(){
		String Fullname=this.fname+this.lname;
		return Fullname;
	}
	
	void display(){
		System.out.println("First name: "+this.fname);
		System.out.println("last name: "+this.lname);
		String fna=getFullname();
		System.out.println("Full name: "+fna);
	}
}

