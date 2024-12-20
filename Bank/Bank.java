package Bank;
public class Bank {
    private int balance = 0;
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
     

    private String createAccount(String firstName, String lastName, String accountNumber){
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
    
    
    
    public static void main(String[] args){
        User user = new User("Stephen", "Ezea");
        Bank bank = new Bank();  
        String accountNumber = bank.createAccount(user.getFirstName(), user.getLastName(), "1234567890");
        System.out.println(user.userInfor());
        System.out.println(accountNumber); 
        System.out.println("Current balance" + bank.balance); 


    }

}