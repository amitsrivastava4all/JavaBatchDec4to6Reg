package com.brainmentors.los.customer;

public class Customer {
	private int id;
	private int stage;
	PersonalInformation personal ; // Has - a
	private Address address;  // Has - A RelationShip
	private double income;
	private double liablity;
	private LoanDetails loanDetails;
	private String remarks;
	
	
	
	
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public LoanDetails getLoanDetails() {
		return loanDetails;
	}
	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonalInformation getPersonal() {
		return personal;
	}
	public void setPersonal(PersonalInformation personal) {
		this.personal = personal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getLiablity() {
		return liablity;
	}
	public void setLiablity(double liablity) {
		this.liablity = liablity;
	}
	
	
	

}
