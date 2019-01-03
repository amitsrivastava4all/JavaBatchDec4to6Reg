import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Employee {
	private static int id;
	private String name;
	private double salary;
	private String companyName;
	private int choice;
	public Employee() {
		companyName = "TCS";
		id++;
	}
	private double hra() {
		return salary * 0.30;
	}
	private double ta() {
		return salary * 0.10;
	}
	private double da() {
		return salary * 0.20;
	}
	private double pf() {
		return salary * 0.05;
	}
	private double gs() {
		return salary + this.hra() + da() + ta() - pf();
	}
	private double ns() {
		return gs() - tax();
	}
	private double tax() {
		double grossSalary = gs();
		if(grossSalary>=900000) {
			grossSalary =  grossSalary * 0.30;
			return grossSalary;
		}
		if(grossSalary<900000 && grossSalary>=500000) {
			return grossSalary * 0.20;
		}
		if(grossSalary<500000 && grossSalary>=300000) {
			return grossSalary * 0.10;
		}
		return 0;
		
	}
	public void printSalarySlip() {
		Locale locale = null;
		if(choice ==2) {
		// int x =100;
			locale =new Locale("hi", "IN");
		}
		else
		if(choice==1) {
			 locale =new Locale("en", "US");
		}
		else
		if(choice ==3) {
			 locale =new Locale("fr", "FR");
		}
		else {
			 locale =new Locale("en", "US");
		}
		
		Date date =new Date();
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT,locale);
		String formattedDate = df.format(date);
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Date "+formattedDate);
		System.out.println("Salary Slip of "+companyName);
		System.out.println("Id "+id+" Name "+name);
		System.out.println("Basic Salary "+nf.format(salary));
		System.out.println("Hra "+nf.format(hra()));
		System.out.println("Da "+nf.format(da()));
		System.out.println("TA "+nf.format(ta()));
		System.out.println("PF "+nf.format(pf()));
		System.out.println("Tax "+nf.format(tax()));
		System.out.println("NS "+nf.format(ns()));
		
	}
	public Employee( String name , double salary, int choice) {
		this();
		//this.id = id;
		this.name = name;
		this.salary = salary;
		this.choice = choice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getCompanyName() {
		return companyName;
	}
	
}
