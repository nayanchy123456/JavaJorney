package practice;

public class main {
	
	    public static void main(String[] args) 
	    {
	        SavingAccount savingAccount = new SavingAccount(150);
	        savingAccount.deposit(50);
	        savingAccount.withdraw(30);  // This should be allowed
	        savingAccount.withdraw(120); // This should be denied
	    }
	}

