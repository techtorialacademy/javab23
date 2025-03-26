package Primitives.Numerical;

public class CharType {
    // size: 16 bit (stores single Unicode character)
    // Range: 0 - 65K
    // Used for storing a single character.
     public static void main(String[]args){
         // java stores unicode characters using char data type.
         // unicode characters from 0-127 are identical to ASCII table.
         char letterA = 'A';
         // Now this char data type is holding 2 information:
            // 1. Character itself -> A
            // 2. Decimal value for the character -> 65
         // we should not memorize the decimal value for any character.
         // What do we need to know?
            // We need to know when Java uses a character value or when it uses the decimal
            // value.
            // Any arithmetic operation between char and another numerical primitive or
           // itself, Java will use the decimal value.

            // All other times java will use the character value.

         char ch1 = 'T'; // decimal value for T is 84

         System.out.println(ch1); // T // no arithmetic operation with itself or another numerical

         System.out.println(ch1 + 2); // 86

         System.out.println(ch1 + ch1); // numerical result // 168

         char testVar = 67; // in this case java will look at the unicode(ascII) then
         // will find which character has the decimal value as 67. -> C -> Capital c.


         System.out.println(testVar); //  character itself -> C




     }


}
