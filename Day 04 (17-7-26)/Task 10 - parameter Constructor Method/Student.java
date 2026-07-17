class Student{
	int id;
	String name;
	
	Student(int id,String name){ 
		this.id=id;
		this.name=name;
	}
	
	void getStudent(){
		System.out.println("ID:"+id);  
		System.out.println("Name:"+name);
	}		
}