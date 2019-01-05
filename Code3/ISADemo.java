import java.util.ArrayList;

class Account{
	int id;
	String name;
	double balance=2000;
	void withDraw() {
		System.out.println("Account WithDraw Call"+balance);
	}
}
class SavingAccount extends Account{
	void roi() {
		System.out.println("Rec 4 % ROI");
	}
}
class CurrentAccount extends Account{
	void saroi() {
		System.out.println("Pay 5% ROI");
	}
}
//class FixedDepositAccount extends Account{
//	
//}
//class LoanAccount extends Account{
//	
//}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main(null);
		System.out.println("Program Start");
		ArrayList l = new ArrayList();
		while(true) {
		SavingAccount sa = new SavingAccount();
		l.add(sa);
		//sa.roi();
		//sa.withDraw();
		}
		
		
		

	}

}
