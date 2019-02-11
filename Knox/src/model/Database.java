package model;

public class Database {
	private Account acct;
	private List<Bill> bills;
	private List<Transaction> transactions;
	private List<Payee> payees;
	
	public Database() {
		acct = new Account(1234, "")
		transactions = new ArrayList<transaction>();
		
	}
}
