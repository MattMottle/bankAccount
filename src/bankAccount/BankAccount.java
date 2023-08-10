package bankAccount;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private long accountNumber;
	private static int accounts;
	private static double totalMoney;
	
	public BankAccount(long accountNumber) {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = accountNumber;
		accounts++;
	}
	// getters
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public static int getAccounts() {
		System.out.println(accounts);
		return accounts;
	}
	public static double getTotalMoney() {
		System.out.println(totalMoney);
		return totalMoney;
	}
	//methods	
	public void deposit(double depositAmount, String account) {
		if(account.equals("checking")) {
			checkingBalance += depositAmount;
			BankAccount.totalMoney += depositAmount;
		}
		else if(account.equals("savings")) {
			savingsBalance += depositAmount;
			BankAccount.totalMoney += depositAmount;
		}
		else {
			System.out.println("Input must be savings or checking");
		}
	}
	
	public void withdraw(double withdrawalAmount, String account) {
		if(account.equals("checking")) {
			if(withdrawalAmount > checkingBalance) {
				System.out.println("You have insufficient funds in your checking account.");
			}
			else {
				checkingBalance -= withdrawalAmount;
				BankAccount.totalMoney -= withdrawalAmount;
			}
			
		}
		else if(account.equals("savings")) {
			if(withdrawalAmount > savingsBalance) {
				System.out.println("You have insufficient funds in your savings account.");
			}
			else {
				savingsBalance -= withdrawalAmount;
				BankAccount.totalMoney -= withdrawalAmount;	
			}
		}
		else {
			System.out.println("Input must be savings or checking");
		}
	}
	
	public void display() {
		System.out.printf("Account Number: %s \n", accountNumber);
		System.out.printf("Your checking balance is $%.2f \n", checkingBalance);
		System.out.printf("Your savings balance is $%.2f \n", savingsBalance);
	}
	
}
