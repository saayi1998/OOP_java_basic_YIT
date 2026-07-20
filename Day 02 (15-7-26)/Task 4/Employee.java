class Employee{
	int id;
	String name;
	double basicsalary;
	double bonus;
	
	void setEmployee(){
		id=1001;
		name="seelan";
		basicsalary=150000;
	}
	
	void calcBonus(){
		if(basicsalary>=100000){
			bonus=basicsalary*0.1;
		}else{
			bonus=basicsalary*0.05;
		}
	}
	
	void getEmployee(){
		System.out.println("ID:"+id);  
		System.out.println("Name:"+name); 
		System.out.println("Basic Salary:"+basicsalary); 
		System.out.println("Bonus:"+bonus); 
		System.out.println("Net Salary:"+(basicsalary+bonus)); 
	}		
}