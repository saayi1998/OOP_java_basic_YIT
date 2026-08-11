class MainStudent{
	public static void main(String args[]){
		
		Student stu1=new Student();
		stu1.setStudent();
		stu1.getStudent();
		
		Student stu2=new Student();
		stu2.setStudent(5000);
		stu2.getStudent();
		
		Student stu3=new Student();
		stu3.setStudent("Sai");
		stu3.getStudent();
		
		Student stu4=new Student();
		stu4.setStudent(4500,"Kajan");
		stu4.getStudent();
		
		Student stu5=new Student();
		stu5.setStudent("thivagar", 5500);
		stu5.getStudent();
	} 
} 