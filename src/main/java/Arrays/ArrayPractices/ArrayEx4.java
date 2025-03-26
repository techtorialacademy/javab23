package Arrays.ArrayPractices;

public class ArrayEx4 {
    public static void main(String[]args){
        char[] symbols = {'L', 'K','5', '$', '@', 'b', 'W', '1','!'};
        System.out.println(symbols.length);
        // print only symbols from this array
        // To solve this question:
        // 1st I need to look each element in the array
        // for loop
        // 2nd For each element I need to check whether or not they are symbols
        // 3rd How could I know if they are symbols
        // If the character is not letter AND if it is not number
        // it could only be symbol.
        for(int i = 0 ; i < symbols.length ; i++){
          // If the character is a letter it must be in between
            // 'a' and 'z' or 'A' and 'Z'
            // If the character is a number it must be in between
            // '0' and '9'
            if (
                    !(
                            (symbols[i] <= 'z' && symbols[i] >= 'a')
                                    ||
                            ( symbols[i] >= 'A' && symbols[i] <= 'Z')
                    )
                    &&
                     !(symbols[i] >= '0' && symbols[i]<='9')
            ){
                System.out.println("Symbol -> " + symbols[i]);
            }

        }







    }
}
