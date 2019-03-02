
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a= "Hello";
		String b = a;
		a+="ok";
		System.out.println(a==b);
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb =new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello");
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello How are You I am Good" );
		System.out.println(sb.capacity());
		System.out.println(sb.length());
//		sb.insert(1, "AAA");
//		sb.deleteCharAt(0);
//		sb.delete(2, 5);
		System.out.println(sb);
		sb.replace(0, 7, "ABCDEFG");
		System.out.println(sb);
		String t = sb.toString();
		StringBuffer r = new StringBuffer(t);
		synchronized (r) {
			r.append("fsfd");
		}
		
	}

}
