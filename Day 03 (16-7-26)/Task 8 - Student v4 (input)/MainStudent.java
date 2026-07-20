import java.util.Scanner;

class MainStudent{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		Student S; 
		S = new Student(); 
		
		System.out.print("Enter your ID: ");
		int x = scan.nextInt();
		System.out.print("Enter your Name: ");
		String y = scan.next();
		
		S.setStudent(x,y); 
		S.getStudent();
	
	} 
} 