package Primitives.Numerical;

public class Casting {

    public static void main(String[]args){

        int count = 128;
        // Let's try to store count variable's value to byte type
        byte num = (byte) count; // Explicit casting, storing int type to byte type.

        System.out.println("count value as integer >>>> " + count);
        System.out.println("When count is casted to byte >>>> " + num);



        // Do we always loose data when explicit casting?
        // No, we only loose data if the value is bigger than the limit
        // of casted data type.

        int balance = (int) 14.33; // explicitly casted 14.33 from double type to int type.
        System.out.println("14.33 casted to integer type >> "+ balance);
        // Can we store a decimal point in int type?
        // No, we cannot. So when a decimal type like float or double is casted to
        // int or long type you loose all decimal point.
        double orgDistance = 123456.12345;
        long distance = (long) orgDistance;

        System.out.println(orgDistance + " is casted to long >> "+ distance);//123456

        // Let's cast result of arithmetic operations
        byte b1 = 5,b2 = 8;

        byte result1 = (byte)(b1 + b2); // How do we cast? Explicitly cast

        // To force the result as byte
        // A -> = (byte) b1 + b2
        // B -> = byteDataType + byteDataType
        // C -> = b1 + (byte)b2

        // Which one of the above is the answer?
        // none

        float fl1 = 5.0f;
        double d1 = 4.0;
        int result =(int)(fl1+d1);
        int result2 = (int)fl1 + (int)d1;

        int l1 =(int)(long)(fl1 + d1);
        // Double casting - It is not used but it is possible
        // First java will do inside the parentheses which means we
        // find the (fl1 + d1) which results in double data type as 9.0.
        // Second we cast this result to long -> (long)(9.0)
        // Then it becomes -> long 9
        // then we are casting value long 9 to int -> (int)9

        // How could we explicitly cast fl1 and d1 so the expression could
        // work without a problem?
        // since int + int gives result in int we can do (int)fl1 + (int)d1
        // or (int)(fl1+d1)








    }





}
