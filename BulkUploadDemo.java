class JobA extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i+"Thread is "+Thread.currentThread().getName());
		}
	}
}
public class BulkUploadDemo  {
public static void main(String[] args) {
	JobA a = new JobA();
	a.start();
}
}
