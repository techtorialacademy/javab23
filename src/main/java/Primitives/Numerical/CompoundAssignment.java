package Primitives.Numerical;

public class CompoundAssignment {

    public static void main(String[]args){

        double bread = 5;
        // If I want to equally divide this bread num?
        bread /= 2 ; // bread = bread / 2

        System.out.println(bread); // 2.5

        double balance = 100.76;
        // If I pay $40 electricity bill what will be my new balance?
        balance -= 40;

        System.out.println(balance); // 60.76

        // If I share my money equally between my 4 kids what will be my balance
        // left to me?
        balance %= 4;
        System.out.println("I had 60.76 balance. After giving to kids -> "+ balance);


    }


}
