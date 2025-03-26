package Primitives.Numerical;

public class PrimitivesSummary {

    public static void main(String[] args){
        // Variables in Java are named references to data that can be used
        // and manipulated throughout your program(code.).
        // Primitive types are the basic building blocks in Java for data representation,
        // with each type having a specific size, range and use purpose.

        // Declaring a Variable:
        // Declaration is the process of creating variable by its data type and name.
        // No value assigned.
        int age; // declaring an integer variable by the name age.
        double average; // declaring a double data type by the name average;

        // Assigning value to a variable
        // once the variable is declared then a value can be assigned.
        // When you assign a value, you are storing data in the variable's memory location.
        age = 41;// assigning value to a variable called age.
        average = 4.73; // assigning value to a variable called average.

        // Declaration and Assignment can be done in single line.
        // common way of creating variables.
        char ch = 'Y'; // Variable is declared and assigned in single line.
                        // this is also called initialization of the variable.

        // ---
        // We could simplify creating multiple variables with same data type

//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
        // instead of the code above:
        int num1 = 1, num2 = 2, num3 = 3;
        // Initialization of multiple variables in single line.


        // Learning the maximum or minimum value for primitive types
        // We will use wrapper class of the primitives. -- this means use
        // the data type name starting with upper case and full name of the data type.
        // Learning biggest value in `int` primitive
        System.out.println(Integer.MAX_VALUE);
        // Learning the minimum value in `int` data type
        System.out.println(Integer.MIN_VALUE);

        // Double biggest and smallest
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        // Long Min and Max values
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);

        // Char min and max
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        // Byte Short min and max
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);














    }




}
