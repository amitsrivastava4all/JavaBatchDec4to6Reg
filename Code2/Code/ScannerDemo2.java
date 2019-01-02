import java.io.File;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int wordCount = 0;
		int hCounter = 0;
		Scanner s = new Scanner("Hello-How-are-You"); 
		s.useDelimiter("-");
		//   c:\\abcd\\xyz.java
		//File file = new File("/Users/amit/Documents/JavaDecbatchRegWS/MyProject/src/ScannerDemo2.java");
		//Scanner s = new Scanner(file);
		while(s.hasNext()) {
			wordCount++;
			String w = s.next();
			if(w.contains("String")) {
				hCounter++;
			}
			System.out.println(w);
		}
		System.out.println("Total Word "+wordCount+" H Counter "+hCounter);

	}

}
