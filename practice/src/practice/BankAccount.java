package practice;

public class BankAccount {

	    protected double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
	        } else {
	            System.out.println("Insufficient funds. Withdrawal denied.");
	        }
	    }
	}

	public class SavingAccount extends BankAccount {
	    public SavingAccount(double balance) {
	        super(balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= 100) {
	            super.withdraw(amount);
	        } else {
	            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
	        }
	    }
	}




