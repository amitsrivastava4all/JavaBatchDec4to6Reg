


class A{
	A(){
		System.out.println("A Cons Call");
	}
	A(int x){
		System.out.println("A Param Cons ");
	}
	void show() {
		System.out.println("A Show");
	}
}
class B extends A{
	B(){
		System.out.println("B Cons Call");
	}
	B(int x){
		super(x);
		System.out.println("B Param Cons");
	}
	@Override
	void show() {
		super.show();
		System.out.println("B Show");
	}
}
class C extends B{
	C(){
		//super();
		System.out.println("C Cons Call");
	}
	C(int x){
		super(x);
		System.out.println("C Param Cons ");
	}
}
class Emp{
	int id;
	String name;
	void Emp(int id , String name){
		
		this.id = id;
		this.name = name;
		
	}
	
	
}
public class Multi {

	public static void main(String[] args) {
		Emp ram = new Emp();
		ram.Emp(1001, "Ram");
		C c = new C(100);
		c.show();
		// TODO Auto-generated method stub

	}

}







