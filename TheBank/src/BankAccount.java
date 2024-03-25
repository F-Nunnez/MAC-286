
public class BankAccount {
	private double balance; // account balance
	
	public BankAccount(double openingBalance) {
		// constructor
		// validation: openingBalance should be greater than 0
		if (openingBalance < 1) {
			System.out.println("Warning! Opening balance is: "+ openingBalance);
		}else {			
			balance = openingBalance;
		}
	}
	
	public void deposit(double amount) {
		// makes deposit
		// validation: amount should be positive range (1-1000)
		if(amount < 1 || amount > 1000) {
			System.out.println("Deposit is not within range 1 to 1000");
			System.out.println("User input deposit amount: "+amount);
		} else {
			System.out.print("User deposit, ");
			System.out.println(amount);
			balance = balance + amount;
		}
	}
	
	public void withdraw(double amount) {
		// makes withdrawal
		// validation: check if parameter amount is sufficient for withdrawal 
		if(amount > balance) {
			System.out.println("Insuficient funds, current balance: "+ balance);
			System.out.println("Declined withdrawl amount: " +amount);		
		}else {
			System.out.print("User withdraw, ");
			System.out.println(amount);
			balance = balance - amount;
		}
	}
	
	public void display() {
		System.out.println("Balance=" + balance);
	}

} // end class BankAccount
