interface IPlayer1{
	void run(); // public abstract void run();
	abstract void jump();
	void roll();
	void fire();
	default void attack() {
		System.out.println("Common Attack Style");
	}
	// 100 methods
}
abstract class PlayerAdapter implements IPlayer1{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}
	
}
class Honda extends PlayerAdapter{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void roll() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ken1 extends PlayerAdapter{
	int speed=5;
	int x = 10;
	public void run() {
		x +=speed;
	}
	public void jump() {
		
	}
	
}
class Ryu1 implements IPlayer1{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
