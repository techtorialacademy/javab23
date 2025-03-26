package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Map4_Practice2 {
    //create a method to count and store each letter from a String into a hashmap and return your final map
    // "Java"
    // "J" -> 1
    // "a" -> 2
    // "v" -> 1

    //{   "J": 1, "a": 2,
    // }

    public static Map<String,Integer> findCharacterCounts(String str){
        Map<String,Integer> countsMap = new HashMap<>();

        // We should look in to each character in the str
        for(int i = 0 ; i< str.length(); i++){
            String ch = str.charAt(i) + "";
            if(countsMap.containsKey(ch)){
                // I need to increase the count number of the ch
                countsMap.put(ch,countsMap.get(ch)+1);
            }else{
                countsMap.put(ch,1);
            }
        }
        return countsMap;
    }

    public static void main(String[]args){
        String s = "aaabbbcccysfttzzzz";

        System.out.println(findCharacterCounts(s));



    }
}
