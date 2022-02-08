package com.capgemini.sfdc.day2;

class Employee{
	private int employeeId;
	private String firstName;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class BankCustomer {
	
	static String ifsc;
	int accNo;
	String CustomerName;
	double balance;
	
	// other fields
	
	//checkBalance();

}

 class DemoClass {
	
	public static void main(String[] args) {
		
		
		BankCustomer.ifsc="BOBO129292";
		System.out.println(BankCustomer.ifsc);
		
		BankCustomer obj= new BankCustomer();
		obj.accNo=456815816;
		System.out.println(obj.accNo);
		
	}
}