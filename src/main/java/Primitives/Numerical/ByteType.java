package Primitives.Numerical;

public class ByteType {
    // byte
    // Size: 8 bit
    // Range of values it can store: -128 to 127
    // Use: Early times of programming for small values they needed an efficient storage type.
    public static void main(String[] args){
        // create and use byte data type
        byte minimumByteValue = -128; // this is the lowest value that a byte can store

        // We have created a byte variable, how can we use the variable in our code later?
        // To use the variables in our code we can call them by their name.

        // How can I print the value of the variable minimumByteValue?
        System.out.println(minimumByteValue); // -128

        byte cpuNumber = 16;

        // To print out number of CPU's
        System.out.println(cpuNumber); // 16

         // byte cpuNumber = 20; -> This is not possible because variables can only
        // be assigned with a data type at the time of its creation.
        // However, we could do same thing without assigning a data type again and
        // it is called reassignment.And, while the data type remains same value of the variable
        // can change.

        cpuNumber = 20;
        //  --- After line 29 what is the data type of the variable cpuNumber?
        //  byte --- NOTE! In java variables NEVER change their data type after creation.
        //  --- After line 29 what is the value of the variable cpuNumber?
        //  20
        // Let's display the new value value of cpuNumber variable.
        System.out.println("See the new value of cpuNumber variable below.");
        System.out.println(cpuNumber );


        byte numberOfTestCases = 120;

        System.out.println("Current number of test cases is " + numberOfTestCases);


        // A qa lead looked at the test cases and saw that 17 of the 120 test cases
        // are not necessary. Let's reflect this situation in our code.

        numberOfTestCases = 120 - 17;

        System.out.println("After a review with a QA lead number of test cases are " + numberOfTestCases);









    }

}
