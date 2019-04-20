
class OldJob {
	public void print() {
		for(int i = 1; i<=5; i++) {
			System.out.println("I is "+i);
		}
	}
}
class Job implements Runnable{
	int counter;
	@Override
	public synchronized void run() {
		for(int i = 1; i<=5; i++,counter++) {
			System.out.println("Counter is "+counter+" I is "+i+" Worker Name "+Thread.currentThread().getName());
		}
	}
}
public class Demo {
public static void main(String[] args) {
	System.out.println("Inside Main");
	Job job = new Job();
	Thread worker = new Thread(job,"ram");
	worker.start();
	Thread worker2 = new Thread(job,"shyam");
	worker2.start();
	for(int i = 1; i<=10; i++) {
		System.out.println("I am Busy to do some my job "+i);
		
	}
//	OldJob old = new OldJob();
//	old.print();
	
	
}
}
