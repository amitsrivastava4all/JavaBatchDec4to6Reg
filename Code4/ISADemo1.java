import java.io.File;

class Account{
	/** this contain accountNumber in id field **/
	int id;
	/** this contain accountHolderName in name field **/
	String name;
	double balance;
	void roi() {
		System.out.println("Default ROI is 4%");
	}
	void withDraw(int amount) {
		if(balance>0) {
			//System.setOut(new File("/Users/amit/Documents/logs/apps.log"));
			balance = balance - amount;
			System.out.println("With Draw Done "+amount);
		}
		else {
			System.out.println("No Balance");
		}
	}
	
}
class SavingAccount extends Account{
	//@Override
	void roi(int x) {
		System.out.println("Saving Account ROI "+(balance * 0.05));
	}
}
class CurrentAccount extends Account{
	void roi() {
		System.out.println("U Have to Pay "+(balance * 0.07));
	}
}
public class ISADemo1 {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.balance = 5000;
		sa.withDraw(1000);
		sa.roi();
		CurrentAccount ca = new CurrentAccount();
		ca.balance = 5000;
		ca.withDraw(2000);
		ca.roi();
		//Account account = new Account();
/*	int c ;
		int d ; */
		// TODO Auto-generated method stub

	}

}
