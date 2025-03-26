package Objects;

public class BankAccount {
    // How could I create a variable that will be same for EVERY object
    static String bankName;
    String userName, password;
    double balance;
    boolean isLoggedIn;

// create a constructor where user must enter their userName and password to create an object.
    public BankAccount(String user, String pass){
        userName = user;
        password = pass;
    }

    // Methods:
//    - void displayInfo() ->will print out all account information, if user logged in

    public void displayInfo(){
        if(isLoggedIn){
            System.out.println("User Name: " + userName
            + "\n Password: " + password
            + "\n Balance: " + balance
            );
        }else {
            System.out.println("We can't display this information as the user is not logged in.");
        }

    }
//    -boolean logIn() -> userName, password parameters to update isLoggedIn boolean.If user
    public boolean login(String user, String pass){
        if(user.equals(userName) && pass.equals(password)){
            isLoggedIn = true;
            return true;
            // When the code reaches the return statement it stops the block of code.
            }
        System.out.println("Wrong username or password");
        return false;
    }
    //    -boolean logOut() -> isLogged in should become false, and if user already logged out
// this method should display the error message.
    public boolean logOut(){
        if(isLoggedIn){
            System.out.println("Logging out....");
            isLoggedIn = false;
            System.out.println("Logged out....");
            return true;
        }

        System.out.println("User is already logged out!!!!!");
        return false;

    }
    //    - double deposit() -> one parammeter to update balance, if user logged in
    public double deposit(double depositAmount){
        if(isLoggedIn){
            balance += depositAmount;
            System.out.println("Deposit is succesful and the new balance of the account is " + balance);
            return balance;// will return the new value of the acccount balance.
        }
        System.out.println("Deposit was not succesful because user is not logged in.");
        System.out.println("Returning the deposit amount back...  $" + depositAmount);
        System.out.println("Your balance stayed the same $" + balance);
        return balance; // returning the original value of the balance.

    }
//    - double withdraw() -> one parameter to update balance, if user logged in
public double withdraw(double withdrawAmount){
    if(isLoggedIn  && balance >= withdrawAmount ){
        balance -= withdrawAmount;
        System.out.println("Withdraw is succesful and the new balance of the account is " + balance);
        return balance;// will return the new value of the acccount balance.
    }
    System.out.println("Withdraw was not succesful because user is not logged in or not enough balance.");
    System.out.println("Your balance stayed the same $" + balance);
    return balance; // returning the original value of the balance.

}







}
