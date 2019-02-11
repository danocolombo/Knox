package model;

public class Payee {
	
	private int number;
	private String institution;
	private double balance;
	
	public Payee(int number, String institution, double balance) {
		this.number = number;
		this.institution = institution;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
