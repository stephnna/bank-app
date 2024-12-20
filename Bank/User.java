package Bank;

public class User {  
    private String firstName;
    private String lastName;
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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


    public String userInfor(){
        return "Your account details:\nFirst Name: " + this.firstName + '\n' + "Last Name: " + this.lastName;
    }
}