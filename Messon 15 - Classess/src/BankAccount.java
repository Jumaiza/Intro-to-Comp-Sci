
public class BankAccount {

	double balance;
	String name;

	public BankAccount(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	public void withdraw(double withdrawlAmount) {
		balance -= withdrawlAmount;
	}
}
