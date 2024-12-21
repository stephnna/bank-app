package Bank;
public class Main {
 
    public static void main(String[] args){
        User user1 = new User("Stephen", "Ezea", 0);
        User user2 = new User("Emeka", "Onah",  0);
        System.out.println("Current balance: " + user1.getBalance() + '\n');
        System.out.println("Current balance: " + user2.getBalance() + '\n');
        Bank bank = new Bank(); 
        String accountNumber1 = bank.createAccount(user1.getFirstName(), user1.getLastName(), "1234567890");
        String accountNumber2 = bank.createAccount(user2.getFirstName(), user2.getLastName(), "9078912345");
        System.out.println(user1.userInfor());
        System.out.println(user2.userInfor());
        System.out.println(accountNumber1); 
        System.out.println(accountNumber2); 
        System.out.println("Current balance: " + user1.getBalance() + '\n');
        System.out.println("Current balance: " + user2.getBalance() + '\n');
        user1.deposit(5000);
        user1.withdraw(1000);
        user2.deposit(10000);
        user2.withdraw(2000);
        user2.deposit(8000);
        user1.deposit(6000);
        user1.withdraw(11000);
        user2.withdraw(17000);        
    }  
}
