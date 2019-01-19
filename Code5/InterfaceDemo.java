interface IPlayer{
	public abstract void run();
	void kick();
	void jump();
	public static final int MAX_POWER = 100;
}
class Ryu implements IPlayer{
	int power = 10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		if(power<MAX_POWER) {
			power++;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ken implements IPlayer{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ken average run");
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("Ken High KIck");
		
	}

	@Override
	public void jump() {
		System.out.println("Ken average jump");
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayer p = new Ryu();
		p.jump();
		p.run();
		p.kick();

	}

}
