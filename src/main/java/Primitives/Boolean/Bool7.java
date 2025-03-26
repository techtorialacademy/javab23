package Primitives.Boolean;

import java.util.Scanner;

public class Bool7 {

    //  John wants to lose 10 pounds in one month.
    // There are multiple conditions to lose 10 pounds in a month.
    // John needs to walk 10000 steps daily OR needs to run at
    // least 4 miles a day. In addition to these, John needs to
    // eat less than 1500 calories daily. We should create a
    // program to calculate if John can lose 10 pounds or not.
    // daily steps, running distance and daily caloric intake
    // will be given by user. Our goal is to print true when
    //  John can lose weight and print false otherwise.

    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the daily steps: ");
//        int dailySteps = sc.nextInt();
//
//        System.out.println("Enter daily running distance: ");
//        int runningDistance = sc.nextInt();
//
//        System.out.println("Enter the daily caloric intake: ");
//        int DCI = sc.nextInt();
//
//        // 1st part is exercise -> running || walking
//        // AND &&
//        // 2nd part is daily caloric intake
//
//        boolean isExercising = runningDistance >= 4 || dailySteps >= 10000;
//        boolean isDiet = DCI < 1500;
//
//        boolean canLoose10 = isExercising && isDiet;
//
//        System.out.println("Can loose 10 pounds? -> " + canLoose10);

        System.out.println("Enter daily steps: ");
        int dailySteps = sc.nextInt();
        System.out.println("Enter daily running distance: ");
        int runningDistance = sc.nextInt();
        System.out.println("Enter the daily calories intake: ");
        int dailyCalories = sc.nextInt();

        boolean cond1 = dailySteps >= 10000;
        boolean cond2 = runningDistance >= 4;
        boolean cond3 = dailyCalories < 1500;

        boolean canLooseWeight = (cond1 && cond3) || (cond2 && cond3);
        System.out.println("Can he loose waight -> " + canLooseWeight);











    }

}
