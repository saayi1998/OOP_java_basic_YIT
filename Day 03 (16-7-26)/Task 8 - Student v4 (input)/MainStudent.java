import java.util.Scanner;

class MainStudent{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		Student S; 
		S = new Student(); 
		
		int x = scan.nextInt();
		String y = scan.next();
		
		S.setStudent(x,y); 
		S.getStudent();
	
	} 
} 