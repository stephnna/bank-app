package Bank;

public class User {  
    private String firstName;
    private String lastName;
    private int balance;
    
    public User(String firstName, String lastName, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Deposite of " + amount +
         " was successful\nYour new account balance is: " + this.balance);       
    }

    public void withdraw(int amount){
        if((this.balance - amount) <= 0){
            System.out.println("Insufficient fund!");

        }else{
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount +
         " was successful\nYour new account balance is: " + this.balance);       

        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String userInfor(){
        return "Your account details:\nFirst Name: " + this.firstName + '\n' + "Last Name: " + this.lastName;
    }
}
