package Arrays;

import java.util.Arrays;

public class _6_MultiDimensionalArrays {
    // Multidimensinal arrays store another arrays inside.
    public static void main(String[]args){
       String[] citiesIL = {"Chicago","Rosemont","Des Plaines"};
       String[] citiesCO = {"Denver","Telluride"};
       String[] citiesTX = {"Houston","Dallas","Plano"};
    //                            0         1        2
       String [][] allCities = {citiesIL,citiesCO,citiesTX};

       // allCities[0];
       // WHat will allCities[0] will give me? ->  {"Chicago","Rosemont","Des Plaines"}
        System.out.println("allCities[0] -> " + Arrays.toString(allCities[0]));

        //allCities[1][0];
        //allCities[1]; -> citiesCO -> ["Denver", "Telluride"]
        // ["Denver", "Telluride"][0] -> "Denver"

        System.out.println("allCities[1][0] -> " + allCities[1][0]);






    }
}
