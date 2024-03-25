
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount(100); // create account
		
		System.out.print("Before transactions, ");
		ba1.display(); // display balance
		 
		ba1.deposit(1000); // make deposit
		ba1.withdraw(2000); // make withdrawal
		
		System.out.print("After transactions, ");
		ba1.display(); // display balance
	} // end main

} // end class BankApp
