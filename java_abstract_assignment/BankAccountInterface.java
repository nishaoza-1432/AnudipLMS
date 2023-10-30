package java_abstract_assignment;

//interface 
interface BankAccountDetails1 {
	void deposit(double amount);

	void withdraw(double amount);
}

// CheckingAccount class implementing BankAccount interface
class CheckingAccounts implements BankAccountDetails1 {
	private double balance;
	private String accountNumber;

	public CheckingAccounts(String accountNumber, double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	// Deposit method
	public void deposit(double amount) {

		this.balance += amount;
		System.out.println("Account Number:" + this.accountNumber + "\nDeposit Money:" + amount + "\nAfter deposit : "
				+ this.balance);
	}

	// withdraw method
	public void withdraw(double amount) {

		if (amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdrawn:" + this.balance);
		} else {
			System.out.println("Insufficient funds in account ");

		}
	}

}

public class BankAccountInterface {

	public static void main(String[] args) {
		// Create an object of the CheckingAccount class 
		CheckingAccounts account = new CheckingAccounts("AF50673BOI", 10000);

		//calling deposit method and withdraw method
		account.deposit(500.0);
		account.withdraw(200.0);
	}
}
