package Primitives.Numerical;

public class NumericPromotion {

    public static void main(String[]a){

        byte byt = 21;
        short shrt = 30;
        char ch = 'B';
        int integer = 10;
        long lng = 50;
        float fl = 5.75f;
        double dble = 42.70;

        // Let's guess the data type of the result
        int result1 = byt + ch ; // What data type would be MOST suitable for
        // result1?
        // Look at the line 16 and find **ALL** the data types that I can use for
        // result1
        // long, float and double.
        // we could always assign with a bigger data type but we cannot go smaller.
        System.out.println("byt + ch is promoted to int and result is: "+result1);

        float result2 = integer + fl; // What data types would be suitable for result2?
        // float OR double
        // we know that integer number with decimal number will result in decimal
        // data type. So decimal numbers can be stored in double or float so
        // both can be used in this situation
        System.out.println("integer + fl resulted in decimal data type: " + result2);

        long result3 = lng + shrt;
        // What data type would be most suitable for result3?
        // in an arithmetic operation if two different data type is used
        // result will be in bigger type.
        // Since the long data type is bigger than int type, the long value cannot
        // be stored in int.

System.out.println("lng + shrt resulted in bigger data type which is long: " + result3);

        //
        float result4 = byt + fl;
        // What are the suitable data types for result4?
        // float and double
        // decimal data type + integer type will result in one of the decimal types
        System.out.println("byt + fl resulted in decimal data type: " + result4);

        //
        double result5 = lng + fl + dble;
        // What data type could be used for result5?
        // Only dble could be used because one of the operand in the arithmetic
        // operation is double type so the result data type cannot be smaller than
        // double.










    }


}
