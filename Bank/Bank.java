package Bank;
public class Bank {
    private double balance = 0;
    private final int accountLength = 10;
    private String accountNumber;

    private boolean isNumericNumber(String accountNumber) {       
        try {
            Double.parseDouble(accountNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
     
    public String createAccount(String firstName, String lastName, String accountNumber){
        // create account
        if (accountNumber.isEmpty()){
            
            return "Account number cannot be empty";
        }
        else if (accountNumber.length() != accountLength){

            return "Account number must be 10 digits";
        }

        else if (!this.isNumericNumber(accountNumber)){
           return "Account number must be numeric";
        }
        else{
            this.accountNumber = accountNumber;
            return "Account number: " + this.accountNumber;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Deposite of " + amount +
         " was successful\nYour new account balance is: " + this.balance);       
    }


    
}