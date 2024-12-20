package Bank;
public class Main {
 
    public static void main(String[] args){
        User user = new User("Stephen", "Ezea");
        Bank bank = new Bank();  
        String accountNumber = bank.createAccount(user.getFirstName(), user.getLastName(), "1234567890");
        System.out.println(user.userInfor());
        System.out.println(accountNumber); 
        System.out.println("Current balance: " + bank.getBalance() + '\n');
        bank.deposit(5000);
    }  
}
