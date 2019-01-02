
public class Customer {
	private int id;  // Instance Variables
	
	private String name;
	private double balance;
	private String company;
	private String email;
	private String phone;
	private String city;
	private String pincode;
	
	
	public double computeROI() {
		return balance *0.10;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	Customer(){
		company = "TCS";
		//System.out.println("Default Call");
	}
	Customer(int id , String name, double balance){
		this();
		if(id>0) {
		this.id = id;
		 this.name = name;
		 this.balance = balance;
		}
		else {
			System.out.println("Invalid Id ");
		}
		//System.out.println("Param Call");
		
	}
	public void print() {
		System.out.println("*******************************");
		System.out.println("Id "+this.id); 
		System.out.println("Name "+this.name);
		System.out.println("Balance "+balance);
		System.out.println("Company "+company);
	
	}

}
