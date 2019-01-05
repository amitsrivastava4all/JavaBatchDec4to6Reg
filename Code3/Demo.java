import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 9000;
		System.out.println(amount);
		Locale locale =new Locale("fr","Fr");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedAmount = nf.format(amount);
		System.out.println(formattedAmount);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date date = new Date();
		System.out.println(date);
		String formattedDate = df.format(date);
		System.out.println(formattedDate);
		

	}

}
