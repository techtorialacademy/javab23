package Arrays.ArrayPractices;

import java.util.Arrays;

public class ArrayEx6 {

    public static void main(String args[]){

        String[] daysOfWeek = {"Monday","Tuesday", "Wednesday", "Thursday"};
        /*
        print each of the day in reverse version from the given array
        Monday >> yadnoM
        Tuesday >> yadseuT

        2 - store reversed names of the days into another array
        yadsruhT
        yadsendeW
        yadseuT
        yadnoM
         */
        String reversedDays [] = new String[daysOfWeek.length];
        for(int i = 0; i< daysOfWeek.length ; i++){
            String day = daysOfWeek[i];
            String reversed = "";
            for(int j = day.length()-1; j >= 0; j--){
                reversed+=day.charAt(j);
            }
            System.out.println(reversed);
            reversedDays[i] = reversed;
        }

        System.out.println(Arrays.toString(reversedDays));





    }








}
