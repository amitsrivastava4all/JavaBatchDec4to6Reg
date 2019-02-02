
interface IProducer{
	public int add(int x, int y);
}

public class Producer implements IProducer {
	@Override
	public int add(int x, int y) {
		dontCallMe(x);
		return x + y;
	}
	void dontCallMe(int r) {
		System.out.println("Dont Call Me");
	}
}
