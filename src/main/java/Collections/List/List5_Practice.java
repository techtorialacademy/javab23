package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5_Practice {
    public static void main(String[] args) {
        // Let's create list called colors.
        // Store 5 colors in the list, print out the colors' only first letter is uppercase.
        // rest is lower case.
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors,
                "red", "YeLLOw", "bLUe", "blACK", "whITe");
        for(String color : colors){
            // First letter uppercase
            String firstLetter = color.substring(0,1).toUpperCase();
            String restOfColor = color.substring(1).toLowerCase();
            System.out.println(firstLetter + restOfColor);

        }

    }
    }
