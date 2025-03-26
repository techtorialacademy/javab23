package Collections.Map;

import java.util.HashMap;

public class Map3_Practice1 {
    public static void main (String[]aa){
        String[] states = {"IL", "IL", "NY", "WI", "WA", "FL", "FL", "FL" };
        // If the map contains the state key, add 1 to the existing count

        // create a logic to count states and store them in a hashMap as in following format.
        // K      ,     V
        // IL     ,     2
        // NY     ,     1
        // WI     ,     1
        // WA     ,     1
        // FL     ,     3

        HashMap<String, Integer> countsMap = new HashMap<>();

        for(String state : states){
            if(countsMap.containsKey(state)){
                int existingCount = countsMap.get(state);
                existingCount++; // increasing the count and updating the value
                countsMap.put(state,existingCount);// this will update the count of the key .
            }else{
                // It doesn't contain the key
                countsMap.put(state,1);
            }
        }

        System.out.println(countsMap);


    }
}
