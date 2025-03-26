package Primitives.Numerical.Practices;

public class Ex1 {
//    # In the farm we have 35 cows , 23 chickens,
//            #and 40 ducks.
//    # Create a program to calculate total number of
//    # legs in the farm
//    #Requirements for the program is create an int variable for
//            # cows, chickens and ducks , and create variables
//    #for their number of legs.
    public static void main(String[]args){
        int cowCount = 35;
        int chickenCount = 23;
        int duckCount = 40;

        int legsOf1Cow = 4;
        int legsOf1Chicken = 2;
        int legsOf1duck = 2;

        int totalCowLegs = cowCount * legsOf1Cow;
        int totalChickenLegs = chickenCount * legsOf1Chicken;
        int totalDuckLegs = duckCount * legsOf1duck;

        // I need to find out total legs of all animals
        int totalLegs = totalCowLegs + totalChickenLegs + totalDuckLegs;

        System.out.println("Total number of legs in the farm is " + totalLegs);





    }


}
