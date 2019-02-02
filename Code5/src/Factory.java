import java.util.ResourceBundle;

public class Factory {
	
	public static IProducer getObject() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("classname");
		System.out.println(className);
		if(className.equals("FasterProducer")) {
			return new FasterProducer();
		}
		else {
			return new Producer();
		}
		//return new Producer();
	}

}
