package Primitives.Boolean;

import java.util.Scanner;

public class Bool5 {
    // Company wants to increase their server according to their CPU usage.
    // Create a java program that gets average cpu usage as an input
    // and prints true if we need to launch more servers for our application.
    // When average cpu usage is between 40 and 70 inclusive,
    // then we should launch a new server.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter avg CPU Utilization: ");
        int avgCPUUsage = sc.nextInt();

        // I need to create a boolean variable that will be true,
        // when the avg CPU usage is in between 40 and 70 inclusive.

        // the cpu usage should be bigger than or equal to 40 AND
        // the cpu usage should be less than or equal to 70

        boolean  _40orOver = avgCPUUsage >= 40;
        boolean _70orUnder = avgCPUUsage <= 70;

        // I need both of the conditions which means I need to combine bool values above
        // with && operator
        boolean shouldLaunch = _40orOver && _70orUnder;

        System.out.println(shouldLaunch);





    }


}
