interface Calc{
	int add(int x, int y);
}
class CalcDemo implements Calc{
	public int add(int x, int y) {
		return x + y;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(10>2) {
		Calc d = new Calc() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		Calc d1 = new Calc() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println(d.add(1000, 2000));
		System.out.println(d1.add(2000, 2000));
		}
		
		Calc c = new CalcDemo();
		int result = c.add(100,200);
		System.out.println("Result "+result);
		

	}

}
