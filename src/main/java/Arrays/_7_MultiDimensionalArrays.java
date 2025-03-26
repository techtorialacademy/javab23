package Arrays;

import java.util.Arrays;

public class _7_MultiDimensionalArrays {
    public static void main(String[]args){
        // First length is for outer and second length is for inner arrays.
        int[][] numbers = new int[5][3];
        // To print multidimensional arrays, we should use Arrays.deepToString() method
        System.out.println(Arrays.deepToString(numbers));
        // [ [0,0,0], [0,0,0], [0,0,0], [0,0,0], [0,0,0]]

        // We could assign values to numbers
        // let's change all the values for the first array
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        System.out.println(Arrays.deepToString(numbers));

        // Let's assign 2nd element of the third array in the numbers array with 41.
        numbers[2][1] = 41;
        System.out.println(Arrays.deepToString(numbers));

     //   int[][] numbers = new int[5][3];

        // Let's use the length variable(attribute)
        System.out.println(numbers.length); // 5 (5 arrays inside the numbers array)
        // Let's find the second array's length in the numbers array
        // Second array uses the index number 1
        System.out.println("Second array's length is " + numbers[1].length);

        // Let's print out each element from the array

        for(int i = 0 ; i < numbers.length ; i++){
//            System.out.println(Arrays.toString(numbers[i]));
            for(int index = 0 ; index < numbers[i].length ; index++ ){
                System.out.println(numbers[i][index]);
            }

        }
        System.out.println("***FOREACH***");
        // Using for each loop
        //   int[][] numbers = new int[5][3];
        // We are storing int arrays inside the numbers array
        OUTER: for( int [] array : numbers){
            INNER: for(int number : array){
                System.out.println(number);
            }
        }
        // Considering the array numbers ->  int[][] numbers = new int[5][3];
        // How many times the outer loop will iterate? 5 times
        // For each execution of the outer loop the inner loop will execute 3 times.















    }





}
