package Primitives.Boolean;

public class Bool2 {
    public static  void main(String[]args){
        int userAge = 40;

        // Let's create a program whether a user can vote or not.
        // If a user is 21 and over we are going to print true,
        // otherwise we will print false.
        // HINT! There will be only 1 boolean and that boolean will
        // be true or false depending on the userAge.
        int ageToVote = 21;

        boolean canVote = ageToVote <= userAge;

        System.out.println("Can a user vote? -> " + canVote);


    }
}
