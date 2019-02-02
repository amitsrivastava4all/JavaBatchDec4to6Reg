
public class Consumer {
public static void main(String[] args) {
	//IProducer p1 = new Producer();
	//p1.dontCallMe(10);
	//IProducer p = new Producer();
	IProducer p = Factory.getObject();
	int result = p.add(100, 5);
	System.out.println("C1 "+result);
	
}
}
