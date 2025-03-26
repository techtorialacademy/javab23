package Arrays;

import java.util.Arrays;

public class _2_LoopInArrays {
    public static void main(String[] args){
        int[] zipCodes = new int[5];

        System.out.println(Arrays.toString(zipCodes));//[0,0,0,0,0]

        zipCodes[0] = 60654;
        zipCodes[1] = 60650;
        zipCodes[2] = 60018;
        zipCodes[3] = 60016;
        zipCodes[4] = 60173;
        System.out.println(Arrays.toString(zipCodes));//[60654, 60650, 60018, 60016, 60173]

        // To loop through the array we will use the index numbers.
        // Range of index numbers start from 0 got till the length of the array(not included)
        for(int index = 0 ; index < zipCodes.length ; index++){
            System.out.println(zipCodes[index]);
        }
        System.out.println("********************************************************");

        // Print out all the even zipcodes from the array?
        for(int index = 0 ; index < zipCodes.length ; index++){
            // I want to print the element if the element is even number
            if(zipCodes[index] % 2 == 0) {
                System.out.println(zipCodes[index]);
            }
        }




















    }

}
