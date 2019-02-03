import static java.lang.System.out;
import static java.lang.Math.pow;
interface TriMath{
//class TriMath{
	//private TriMath() {}
	
static void sin() {
		out.println("Sin");
	}
	static void cos() {
		out.println("COS");
	}
}
class Student{
static int countStudent;
int rollno;
String name;
static {
	countStudent=10;
	System.out.println("During Class Load "+countStudent);
}
Student(){
countStudent++;
System.out.println(countStudent);
System.out.println("Cons Call");
}
}


public class StaticDemo {
	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TriMath.sin();
		pow(2, 3);
		//TriMath m = new TriMath();
		//m.sin();
		Student ram =new Student();
		Student shyam =new Student();
		//System.out.println(Student.countStudent);
	}
}
