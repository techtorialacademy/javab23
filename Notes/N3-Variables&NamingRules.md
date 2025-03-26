
# Java Variable Naming Rules
- Variable names needs to start with letter, `$` or `_`.
    ```java
        int var1 ; //valid name 
        double $var; // valid name
        float _decimal; // valid name
        double 1var; // invalid variable name because variable name must start with 
        // letter, `$` or `_`.
        long -data1; // invalid variable name because variable name must start with 
        // letter, `$` or `_`.
    ```
- Numbers in variable names can be used only after the first character in the name.
    In short, java variable names cannot start with numbers, but can contain numbers.
    ```java
        int var1 ; //valid name 
        double $2; // valid name
        long _3; // valid name
    ```
- You can't use same variable name multiple times to declare variables in single Java file.
    ```java
  public class VariableNaming{
        public static void main(String[] args){
            int a1 ; // declaration of integer variable named a1
            // a1 name is already declared so it cannot be declared again in this file.
            // All the declarations below will generate compile time error.
            int a1 ; // This will generate a compile time error.
            double a1; // This will also generate a compile time error
            char a1 ; // This will also generate a compile time error.
            // Same variable name CANNOT be declared more than once in a java file.
           // Although same variable name cannot be declared more than once, it can be assigned
           // more than once.
           
            // All the codes below will compile fine, as a variable can be assigned multiple times.
            a1 = 5;
            a1 = 10;
            a1 = 11; //etc.
  }}
    ```
  
- Java names cannot contain Java reserved keywords.
    * In java there is more than 50 reserved keywords.
    * Some common Java reserved keywords: `public`, `static`, `synchronized`,`int`,`byte`,`long`,
  `boolean`,`float`, `double`, `try`, `catch`, `finally`, `final`,`void`,`import`, `package` etc.
    * Variable name can contain one of these reserved keywords but it cannot be same.
  








