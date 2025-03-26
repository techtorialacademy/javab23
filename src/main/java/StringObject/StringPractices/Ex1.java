package StringObject.StringPractices;

import java.util.Scanner;

public class Ex1 {
    // Ask user to enter a password and check if user entered a valid password
    // or not.
    // Conditions for a valid password as follows:
    // 1- The password should have both upper and lower case characters.
    // 2- Last character of the password should not be a letter.
    // If user entered a valid password, print congratulations. Otherwise, invalid password.
    // You only need lowercase, uppercase and equals and charAt methods.
    public static void main(String[]args){
        System.out.println("Enter a password");
        Scanner sc = new Scanner(System.in);
        String password = sc.next(); // we are going to get the user's password

        // The password should have both upper and lower case characters.

        // If a string equals to its lowercase version, string consists of ONLY
        // lowercase characters. I do not want string password to be equal to
        // its lowercase version because that means password is all lowercase.
        // AND
        // If a string equals to its uppercase version, string consists of ONLY
        // uppercase characters.I do not want string password to be equal to
        // its uppercase version because that means password is all uppercase.

        // I do not want both of those conditions above.

        boolean isCaseValid =
                !(password.equals(password.toLowerCase()))
                &&
                !(password.equals(password.toUpperCase())) ;

    // 2. Last character of the password should not be a letter.
    // If a string equals to its uppercase AND lowercase version at the same time
    // it means it is not an alphabetical character.(letter).If it was a letter,
    // it is impossible to be equal to its lowercase and uppercase version at the same
    // time.
    // How could I get the last character from password?
    char lastCh = password.charAt(password.length()-1);
    // how could i convert char above to a string value? (add empty string to a char
        // to make it a string value
    String lastCharacter = lastCh + "";
    boolean isLastSpecialCharacter =
            lastCharacter.equals(lastCharacter.toLowerCase())
            &&
            lastCharacter.equals(lastCharacter.toUpperCase());

    if( isLastSpecialCharacter && isCaseValid){
        System.out.println("Congratulations, correct password.");
    }else{
        System.out.println("Invalid password.");
    }










    }




}
