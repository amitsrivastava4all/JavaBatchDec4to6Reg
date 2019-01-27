
public class Consumer {
public static void main(String[] args) {
	IProducer p = new Producer();
	int result = p.add(100, 200);
	System.out.println("C1 "+result);
	
}
}
