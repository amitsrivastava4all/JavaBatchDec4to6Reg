
public class Consumer2 {
public static void main(String[] args) {
	//IProducer p = new Producer();
	IProducer p = Factory.getObject();
	int result = p.add(100, 2);
	System.out.println("C2 "+result);
	//p.dontCallMe();
}
}
