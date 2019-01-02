
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram  = new Customer(1001,"Ram",8888);
		ram.print();
		ram.setBalance(ram.getBalance()+1000);
		System.out.println(ram.getBalance());
//		ram.id = -1001;
//		ram.name = "Ram";
//		ram.balance=-9999;
				
		
		
		//System.out.println(ram.id+" "+ram.name+ " "+ram.balance);
		Customer shyam  = new Customer(1002,"Shyam",5555);
		shyam.print();
		//System.out.println(shyam.id+" "+shyam.name+ " "+shyam.balance);
		

	}

}
