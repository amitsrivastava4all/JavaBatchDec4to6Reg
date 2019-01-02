import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the Id ");
		int id = scanner.nextInt(); 
		System.out.println("Enter the Name");
		//String name = scanner.next();
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Id "+id+" Name "+name+" Salary "+salary);
		scanner.close();
		
		Scanner scanner2 =new Scanner(System.in);
		System.out.println("Enter the Bonus ");
		int bonus = scanner2.nextInt();
		System.out.println("Bonus is "+bonus);
		scanner2.close();
		
		
		//int singleByte = System.in.read();
		//System.out.println(singleByte);
	}

}
