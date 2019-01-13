class P{
	
	int x = 10;
}
class Q extends P
{
	int x =20;
}
class T extends Q{
	int x = 30;
	int z =99;
	final int M;
	T(){
		M = 200;
	}
	T(int x){
		this();
		//M = 100;
		int z = ((P)this).x + ((Q)this).x + this.x + x;
		System.out.println("Z is "+z);
	}
}

//final class W{
//	
//}
//class M extends W{
//	
//}

public class superandthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T obj = new T(40);

	}

}
