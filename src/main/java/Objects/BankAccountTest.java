package Objects;

public class BankAccountTest {

    public static void main(String[]args){
        BankAccount account = new BankAccount("techtorial","Admin12345");

        // Can I deposit money into acount now?
        account.deposit(200);

        account.login("hello","there");

        account.login("techtorial","Admin12345");

        // Since I logged in with correct credentials I must be able to deposit money.
        account.deposit(400);

       account.withdraw(500);

       account.withdraw(315);

       account.logOut();

       account.logOut();

       account.displayInfo();
        account.login("techtorial","Admin12345");
        account.displayInfo();

        BankAccount acct2 = new BankAccount("test","testing");

        acct2.login("test","testing");

        acct2.displayInfo();


        // Showing the difference in static variable and how it differs from the instance variables.

        System.out.println(account.userName);
        System.out.println(acct2.userName);

        account.userName = "hello"; // this only changes the username variables value
        // for the account object.
        System.out.println(acct2.userName);

        // Let's see how that works for the static variables
        System.out.println(account.bankName);
        System.out.println(acct2.bankName);

        account.bankName = "BBANK";

        System.out.println(acct2.bankName);
        System.out.println(account.bankName);

        acct2.bankName = "TestBANK";


        System.out.println(acct2.bankName);
        System.out.println(account.bankName);

        // Static variable creates a value that will be affecting ALL instances of the class
        // and will be same for EVERY instance of that class.












    }



}
