class Student{
	int id;
	String name;
	
	void setStudent(int ids,String names){
		id=ids;
		name=names;
	} //parameter
	
	void getStudent(){
		System.out.println("ID:"+id);  
		System.out.println("Name:"+name);
	}		
}