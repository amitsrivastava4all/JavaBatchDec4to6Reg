import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



interface P{
	void show();
	public default void print() {
		System.out.println("I am Print in P");
	}
	int X = 10;
}
interface Q{
	int X = 20;
	void show();
	public default void print() {
		System.out.println("I am Print in Q");
	}
}
interface T extends P,Q{
	public default void print() {
		P.super.print();
		Q.super.print();
		System.out.println("T print");
	}
}
class T1 implements T{
	public void show() {
		System.out.println("T1 Show");
	}
}

class MyScreen implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 obj = new T1();
		obj.show();
		obj.print();
		WindowListener w;
		WindowAdapter w1;

	}

}
