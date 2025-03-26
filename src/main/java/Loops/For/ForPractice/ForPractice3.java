package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice3 {
    // Given a string value find the count of letters in the string.
    // 12HELLo@@@ -> 5
    // !!TestingJava!! -> 11
    // !@#$Test&*() -> 4
    // Get the each character in the string
    // then check if that character is bigger than char 'a' and lower than char 'z'.
    // In ASCII table each character has a numerical value, and these are corresponding
    // to their alphatical order.
     public  static  void  main(String[]arg){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a string; ");
         String s = sc.next();

         int countOfLetter = 0;

         for( int i = 0 ; i< s.length() ; i++){
             char currentCh = s.charAt(i);
             // Need to check if the currentCh is a letter
             if((currentCh >= 'a' && currentCh <= 'z')
                                 ||
                (currentCh >= 'A' && currentCh <= 'Z')
             ){
                 countOfLetter++;
             }

         }

         System.out.println("Count of the letters in the string is " + countOfLetter);










     }






}
