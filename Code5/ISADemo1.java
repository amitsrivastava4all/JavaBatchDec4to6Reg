import java.io.File;

abstract class Account{
	/** this contain accountNumber in id field **/
	int id;
	/** this contain accountHolderName in name field **/
	String name;
	double balance=5000;
	abstract void roi();
	/*void roi() {
		System.out.println("Default ROI is 4%");
	}*/
	final void services() {
		System.out.println("Door to door service...");
	}
	void withDraw(int amount) {
		if(balance>0) {
			//System.setOut(new File("/Users/amit/Documents/logs/apps.log"));
			balance = balance - amount;
			System.out.println("PARENT With Draw Done "+amount);
		}
		else {
			System.out.println("No Balance");
		}
	}
	
}
class SavingAccount extends Account{
	//@Override

	void roi(int x) {
		System.out.println("Ovrloading ...Saving Account ROI "+(balance * 0.05));
	}
	//@Override
	void roi() {
		//super.roi();
		System.out.println("Saving Account ROI 6% "+(balance*0.06));
	}
}
class CurrentAccount extends Account{
	void roi() {
		//super.roi();
		System.out.println("CurrentAccount U Have to Pay 7% "+(balance * 0.07));
	}
	void odLimit() {
		System.out.println("CurrentAccount OverDraft Limit CA BASED REPO ");
	}
}
class AccountCaller{
	void callAccount(Account account) {
		//Account account = new CurrentAccount();
		account.withDraw(1000);
		account.roi();
		//int m = 10>2?20:90;
		//(account instanceof SavingAccount)?((SavingAccount) account).roi(10):((CurrentAccount) account).odLimit();
		if(account instanceof SavingAccount) {
			SavingAccount s = (SavingAccount) account;
			long e = 1000;
			//int w = (int)e;
			s.roi(10);
		}
		else if(account instanceof CurrentAccount) {
			((CurrentAccount) account).odLimit();
		}
		System.out.println("*********************");
	}
}
public class ISADemo1 {

	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		//ac.callAccount(new Account());
		ac.callAccount(new CurrentAccount());
		ac.callAccount(new SavingAccount());
		//account.odLimit();
		//account.roi(10);
		/*
		SavingAccount sa = new SavingAccount();
		sa.balance = 5000;
		sa.withDraw(1000);
		sa.roi();
		sa.roi(1000);
		System.out.println("*********************************");
		CurrentAccount ca = new CurrentAccount();
		ca.balance = 5000;
		ca.withDraw(2000);
		ca.roi();
		ca.odLimit();
		*/
		//Account account = new Account();
/*	int c ;
		int d ; */
		// TODO Auto-generated method stub

	}

}
