package Primitives.Numerical;

public class VariableNaming {

    public static void main(String[] args){

        int num1;
         // variable num1 is declared
        // but this variable has no value assigned yet
        num1 = 10 ; // variable num1 is assigned with value 10

        System.out.println(num1); // 10 // Printing is just for us to see what is happening
        // in the code

        // We could change the assigned value to variable num1 by reassigning with a different value

        // Reassignment -> Assigning with a different value
        num1 = 27;
        System.out.println(num1); // 27 // It will always use the most recent value assigned.

        // As seen in the code the variable num1 could be assigned multiple times
        num1 = 50;

        System.out.println(num1); // 50
        // After every declaration or assignment we use semi column -> ;
        // Every time we put a semi column java understand that as a statement
        // so when we print out OR use a variable java will look at what is the latest previous
        // statement a value is assigned and use that value.

        // A variable cannot be declared more than once with same or different data type.

        // double num1; -> compile time error
        // int num1; -> compile time error
        // num1 is already declared in this file

//            * Some common Java reserved keywords: `public`, `static`, `synchronized`,`int`,`byte`,`long`,
//  `boolean`,`float`, `double`, `try`, `catch`, `finally`, `final`,`void`,`import`, `package` etc.
//                * Variable name can contain one of these reserved keywords but it cannot exactly
//                be same.

        int Try = 11;  // try and Try is not same -> naming variables is case sensitive

        int catch1 = 5; // catch1 is a valid name because it is not same as the reserved keyword
        // catch

        int _void = 2; // _void is not same as void.





    }


}
