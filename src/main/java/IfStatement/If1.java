package IfStatement;

public class If1 {
    public static void main(String[] args){
        boolean hasMoney = true;

        // If the user has money we should print yes you could buy the product
        if (hasMoney){
            System.out.println(" User could buy the product. ");
            // code in this if block is only going to be executed when
            // hasMoney bool variable is true.
        }
        System.out.println("Have a great day!! ");

        // Will the code on line 13 get executed?
        // Since the line 13 is `outside the if block` it will get
        // executed regardless of the condition.


    }
}
