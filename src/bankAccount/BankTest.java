package bankAccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount mattsAccount = new BankAccount(141235);
		BankAccount bradsAccount = new BankAccount(342353);
		BankAccount miasAccount = new BankAccount(542345);
		
		mattsAccount.display();
		mattsAccount.deposit(10.25, "checking");
		mattsAccount.deposit(100.00, "savings");
		mattsAccount.display();
		
		bradsAccount.display();
		bradsAccount.deposit(100.00, "savings");
		bradsAccount.deposit(300.00, "checking");
		bradsAccount.display();
		
		miasAccount.display();
		miasAccount.withdraw(25.00, "savings");
		miasAccount.withdraw(25.00, "checking");
		miasAccount.display();
		
		BankAccount.getAccounts();
		BankAccount.getTotalMoney();
	}

}
