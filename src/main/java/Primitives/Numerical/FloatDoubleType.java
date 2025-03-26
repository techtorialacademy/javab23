package Primitives.Numerical;

public class FloatDoubleType {
    // Float: Size: 32 bit // Range: Less Than Double /
    // Use: For decimal numbers with single precision.Float type is less precise than
    // double type and to assign a value to a double type must use f at the end.

    // Double: Size 64 bit // Range Larger than Float : Use:
    // For more precise results with decimal numbers.

    public static void main(String[] args){

        float salary = 50575.85f; // to store a decimal value with float, we must
        // add f at the end of the value.

        // Most common data type to store decimal numbers in Java.
        // double data type.
        double price = 22.79; // storing a decimal number with double data type.

        // If you want to get a decimal number as a result of a division arithmetic
        // operator, then you must use one of the decimal data types.

        int num1 = 18;
        int num2 = 4;

        System.out.println(num1 / num2); // int divided by int will result in integer

        // if I want to get decimal part of the result as well:
        double val1 = 18;
        System.out.println(val1 / num2); // 4.5 // since one of the variables is a decimal data
        // type, the result will be decimal.

        double val2 = 4;
        System.out.println(num1 / val2);// 4.5 // since one of the variables is a decimal data
        // type, the result will be decimal.

        System.out.println(num1 % val2); //2 // remainder will still be same result








    }

}
