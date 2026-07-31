class Student{
	int id;
	String fname;
	String lname;
	int m1;
	int m2;
	int m3;
	
	Student(int id,String fname,String lname){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		
	}
	
	void setMarks(int m1,int m2, int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	int calTotal(){
		int total= this.m1+this.m2+this.m3;
		return total;
	}
	
	double calAverage(){
		int total=calTotal();
		double average= total /3.0;
		return average;
	}
	
	char getResult(){
		char result;
		if (calAverage()>=75){
			result='A';
		}
		else if (calAverage()>=65){
			result='B';
		}
		else if (calAverage()>=50){
			result='C';
		}
		else if (calAverage()>=35){
			result='S';
		}
		else {
			result='W';
		}
		return result;
	}
	
	
	void Display(){
		System.out.println("ID:"+this.id);
		System.out.println("First Name:"+this.fname);
		System.out.println("Last Name:"+this.lname);
		System.out.println("Subject 1 : "+this.m1);
		System.out.println("Subject 2 : "+this.m2);
		System.out.println("Subject 3 : "+this.m3);
		
		int tot = calTotal();
		System.out.println("Total Marks:"+tot);
		
		double avg = calAverage();
		System.out.println("Average:"+avg);
		
		char rest= getResult();
		System.out.println("Result : "+rest);
	}
}