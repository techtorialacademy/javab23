package Arrays.ArrayPractices;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[]args){
        String fall = "Autumn is usually defined in the Northern Hemisphere as the period between " +
                "the autumnal equinox (day and night equal in length), September 22 or 23, and the " +
                "winter solstice (year’s shortest day), December 21 or 22; and in the Southern Hemisphere" +
                " as the period between March 20 or 21 and June 21 or 22. The autumn temperature transition" +
                " between summer heat and winter cold occurs only in middle and high latitudes; in equatorial " +
                "regions, temperatures generally vary little during the year.";
        // 1. Find the number of sentences in the string fall.
        //
         // Each sentence is separated by comma
        String[] sentences = fall.split("\\.");

        System.out.println(Arrays.toString(sentences));
        System.out.println(sentences.length);








    }
}
