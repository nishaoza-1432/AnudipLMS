package java_abstract_assignment;

// Abstract bank account class
abstract class BankAccount {
	protected String accountNumber;
	protected double balance;

	// Abstract method to deposit money
	public abstract void deposit(double money);

	// Abstract method to withdraw money
	public abstract void withdraw(double money);

}

//BankAccount class extends by CheckingAccount class
class CheckingAccount extends BankAccount {
	public CheckingAccount(String accountNumber, double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	// Deposit method
	public void deposit(double money) {

		this.balance += money;
		System.out.println("Account Number:" + this.accountNumber + "\nDeposit Money:" + money + "\nAfter deposit : "
				+ this.balance);
	}

	// withdraw method
	public void withdraw(double money) {

		if (money <= this.balance) {
			this.balance -= money;
			System.out.println("Withdrawn:" + this.balance);
		} else {
			System.out.println("Insufficient funds in account ");

		}
	}

}

public class BankAccountDetails {

	public static void main(String[] args) {
		// creating object for checking account
		CheckingAccount ca = new CheckingAccount("1234567890", 30000);
		// calling methods through object
		ca.deposit(2000);
		ca.withdraw(500);

	}

}
