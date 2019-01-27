
public class Consumer2 {
public static void main(String[] args) {
	IProducer p = new Producer();
	int result = p.add(100, 200);
	System.out.println("C2 "+result);
	//p.dontCallMe();
}
}
