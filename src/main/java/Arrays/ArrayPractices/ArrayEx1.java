package Arrays.ArrayPractices;

public class ArrayEx1 {
    // From the given string below print out the strings that have more than
    // 6 characters.
    public static void main(String[]args){
        String[] words =
                {"testing", "cloud", "server", "api", "database","mobile","cloudfront","json"};
        // First I need to access each element in the array,
        // and check each one of them to asses if they are longer than 6.
        for(int i = 0 ; i < words.length ; i++){
           if ( words[i].length() > 6){
               System.out.println(words[i]);
           }
        }

    }
}
