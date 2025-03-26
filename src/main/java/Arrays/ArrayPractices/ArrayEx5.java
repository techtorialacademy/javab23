package Arrays.ArrayPractices;

public class ArrayEx5 {
    public static void main(String[]args){
        int[] pattern = {1, 2, 3, 4, 5, 6, 8};
        // find out missing number from pattern
        // 2 ways to solve
        // 1st way is knowing the formula
        // Sum of the array is 29
        // What was it supposed to be?

       int actualSum =0;
       for(int i =0 ; i<pattern.length ; i++){

           actualSum += pattern[i];

       }
        int endingValue = pattern[pattern.length-1];

       int expectedSum = 0;
       for(int naturalNumber = 1 ; naturalNumber <= endingValue ; naturalNumber++){
           expectedSum+= naturalNumber;
       }

       int missingValue = expectedSum - actualSum;
       System.out.println("Missing value is " + missingValue);




    }
}
