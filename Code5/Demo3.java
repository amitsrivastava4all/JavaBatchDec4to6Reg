class H{
void show(){  // Scope
int w;  // Local Var
System.out.println("H Show");
}
}
class H1 extends H{
	private int w;
@Override
public void show(){
	System.out.println("H1 Show");
}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H1 obj = new H1();
		obj.show();
		//obj.w = 1000;

	}

}
