package Primitives.Boolean;

public class Bool1 {
    public static void main(String[] args){
         boolean isSunny = false;
         //
        System.out.println(isSunny);
        // Negate the boolean values
        // When a boolean variable is negated it will use the opposite value
        // of the boolean variable.
        // true -> false
        // false -> true
        // To negate a variable use `!` before the variable.
        System.out.println(!isSunny); // true

        //
        System.out.println(isSunny); // false
        // Negating the boolean value DOES NOT reassign the original value.
        // it just uses an opposite value where it is negated

        boolean isLightOn = true;

        System.out.println(!isLightOn); // false

        boolean isCold = isLightOn;

        System.out.println(isCold); // true

        isLightOn = !true;

        System.out.println(isLightOn); // false

        // NOTE
        // -> !true  equals to false
        // -> !false equals to true


    }
}
