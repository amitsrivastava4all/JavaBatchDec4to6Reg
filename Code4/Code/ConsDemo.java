class A{
	int x ;
	A(){
		x = 100;
		System.out.println("A Cons Call "+x);
	}
	A(int x){
		this();
		System.out.println("A Param Cons call");
	}
}
class B extends A{
	int y;
	B(){
		super(200);
		// super();  // Implicit Super Call to Default Cons
		y = 10 +x;
		System.out.println("B Cons Call "+y);
	}
	B(int x){
		this();
		//super(200);
		System.out.println("B Param Cons call");
	}
}
class C extends B{
	int z;
	C(){
		super(100);
		System.out.println("I am C Default Cons");
	}
	C(int z){
		//super(100);
		this();
		System.out.println("I am C Param Cons");
	}
	//C(){}
//	C(){
//		z = 20 + x;
//		System.out.println("C Cons call");
//	}
}
public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B obj = new B();
		C obj = new C();
	}

}
