package Bank;
public class Bank {
    private int balance = 0;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private final int accountLength = 10;

    private boolean isNumericNumber(String accountNumber) {
        if (accountNumber == null) {
            System.out.println("Account number cannot be null");
            return false;
        }
        try {
            Double.parseDouble(accountNumber);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Account number must be digits");
            return false;
        }
    }
     

    private String createAccount(String firstName, String lastName, String accountNumber){
        // create account
        if (accountNumber.length() != accountLength){

            System.out.println("Account number must be 10 digits");
        }

        else if (!this.isNumericNumber(accountNumber)){
            System.out.println("Account number must be numeric");
        }
        else{
            // this.accountNumber = accountNumber;
            this.firstName = firstName;
            // this.lastName = lastName;
            
            System.out.println("Account created successfully");
        }

        return this.firstName;
    }
    
    
    
    public static void main(String[] args){
        Bank bank = new Bank();
        System.out.println(bank.balance);
        System.out.println(bank.createAccount("Stephen", "Ezea", "1234567890"));

    }

}