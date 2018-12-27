
enum WeekDays{
	SUNDAY, MONDAY, TUESDAY
}
class Student{
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		Integer ww = new Integer(0);
		String w = new String();
		System.out.println(ram);
		System.out.println(w);
		System.out.println(ww);
		int b[][][] = new int [3][][];
		System.out.println("B is "+b);
		b[0] = new int[10][];
		b[1] = new int[5][];
		b[2] = new int[2][];
		b[0][0] = new int[4];
		//int h[][]= new int[10][10];
		//int [][]h = new int[10][10];
		//int []h[]= new int[10][10];
		int h[][] = {{10,20,30,40,50},{100,200},{900,1000,9999}};
		//int h[][] = new int[3][];
		//h[0] = new int[10];
		//h[1] = new int[20];
		//h[2] = new int[30];
		
		for(int m[] :h) {
			for(int n : m) {
				System.out.print(n);
			}
			System.out.println();
		}
		/*for(int i = 0; i<h.length; i++) {
			for(int j = 0 ; j<h[i].length; j++) {
				System.out.print(h[i][j]+" ");
			}
			System.out.println();
			
		}*/
		System.out.println("*********************************************");
		
		//int g[] = new int[5];
		//int []g1 = new int[5];
		//int g2 [] = new int[] {10,20,30,40,50};
		int arr [] = {10,20,30,40,50};
		/*for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		// Enhance for Loop 1.5
		for(int i : arr) {
			System.out.println(i);
		}
		
		// Loops
		int m =10;
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i);
		}
		int k = 1;
		for(;k<=10;) {
			k++;
		}
		int j = 1;
		while(j<=10) {
			if(m>2) {
			j++;
			}
			else {
				j+=2;
			}
		}
		do {
			System.out.println("At Least Once...");
		}while(10>110);
		
		int firstNumber = 0 ;
		int secondNumber = 0;
		int result = firstNumber + secondNumber;
		System.out.println("Hello Java "+result);
		boolean x = false;
		if(x==true) {
			System.out.println("Inside if");
		}
		else {
			System.out.println("Inside else");
		}
		//String day  = "Sunday"; // Java 7
		//int day = 2;
		//final int SUNDAY = 1;
		WeekDays day = WeekDays.SUNDAY;  // Before Java 7 (Java 5)
		switch(day) {
		default:
			System.out.println("Wrong Day");
			break;
		//case "Sunday":
		case SUNDAY:
			System.out.println("Enjoy the Day");
			break;
		//case "Monday":
		case MONDAY:
			System.out.println("Boring Day");
			break;
		case TUESDAY:
			//case "Tuesday":
			System.out.println("Need to Work Alot");
			break;
		}
		
		if(10>2) {
			
		}

	}

}
