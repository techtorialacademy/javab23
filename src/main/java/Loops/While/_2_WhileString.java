package Loops.While;

public class _2_WhileString {
    public static void main(String[]args){
        //          012345
        String s = "python";

        // If I tell you I need to get 4th character what index number should i use?
        // s.charAt(3);
        // If I need to get each character 1 by 1, what index numbers should I use?
        // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        // s.charAt(0) -> s.charAt(1) -> ....
        // To be able to get each character from string we need index numbers from
        // 0 to the length of string(length of string is excluded).
        // Let's print each character from string in different lines
        int index = 0;
        while ( index < s.length() )
        {
            System.out.println( s.charAt(index) );
            index++;
        }







    }


}
