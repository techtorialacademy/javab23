package Arrays;

public class _5_ForEachLoop {
    // For each loop is a short syntax of the regular for loop.
    // And it loops through the elements of arrays or collections*
    // without the index numbers. For each loop is a great way to look
    // at each element in the array. However it doesnt work if the usage of index number
    // is necessary.
    public static void main(String[]args){
        // Syntax: for(DataTypeStored name : nameofArray){}
        String[] languages = {"Python","Java","TypeScript","C#","Go","JavaScript","C++","C"};
        // For each loop in to string array languages
        for (String var : languages){
            // This loop will iterate `for each` value in the string array.
            System.out.println(var);
        }

        int[] numbers = {4,5,6,8,9,0,12,56,78,90,6,54,};

        for (int number : numbers ){
            System.out.println(number);
        }
        boolean[] conditions = {false, true, false, true,true};
        for(boolean val: conditions){
            System.out.println(val);
        }






    }
}
