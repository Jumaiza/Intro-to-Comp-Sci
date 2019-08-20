import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = bot.nextLine();
		
		System.out.println("Enter your initial deposit amount");
		double initialDeposit = bot.nextDouble();
		
		BankAccount myAccount = new BankAccount(initialDeposit, name);
		myAccount.deposit(505.22);
		System.out.println(myAccount.balance);
		myAccount.withdraw(100);
		System.out.println("The " + myAccount.name + " account balance is, " + myAccount.balance);
		
	}
}
