import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type 1 for English");
		System.out.println("Type 2 for Hindi");
		System.out.println("Type 3 for French ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
//		System.out.println("Enter the Id ");
//		int id = scanner.nextInt();
		while(true) {
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary ");
		double salary = scanner.nextDouble();
		Employee emp =new Employee( name, salary, choice);
		emp.printSalarySlip();
		System.out.println("Do u want to Continue 0 to exit 1 to continue");
		int ch = scanner.nextInt();
		if(ch==0) {
			break;
		}
		}
		scanner.close();

	}

}
