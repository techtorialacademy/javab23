# Method Overloading
- Method overloading means having multiple methods in the **same class** with the 
**same method name** but **different parameters**.
- The compiler determines which method to call based on the **number, types, and order**
of the arguments provided during the method call.
- This provides a convenient way to perform similar tasks with different inputs without having to use 
multiple method names. 

## Rules Of Method Overloading
1. **Different Parameter Lists**
   * **Number of Parameters**
       Methods can be overloaded by having different count of parameters.
       ```java
        void display(){ ... }
        void display(int a){ ... }
        void display(int a, int b){ ... }
     ```
   * **Parameter Types**
     Methods can be overloaded if the types of parameters ae different
        ```java
          void display(int a){ ... }
          void display(String a){ ... }
        ```
   * **Order Of Parameters**
     Even if the number and types of parameters are the same, changing their order creaetes a
     different signature.
          ```java
            void display(int a, String b){ ... }
            void display(String b, int a){ ... }
          ```     
2. **Return Type Is NOT Part of The Signature**
   * The return type does **not** contribute to a method's signatur. You **cannot** overload 
   methods solely by changing the return type.
    ```java
    // the code below will cause a compile time error
    int display(int a){ ... }
    void display(int b){ ... }
   ```
3. **Access Modifiers Don't Affect Overloading**
    * **Access Modifiers**
    ```java 
     // The compile time error because changing the access modifier 
   // will not affect whether or not you can overload.
     public void display(){ ... }
     private void display(){ ... }
   ```
4. **Static vs Non-Static**
    * Overloading applies equally to both static and instance methods. Whether a method is 
   static or not doesn't affect its ability to be overloaded.--as long as the parameter lists
   differ.
5. **Varargs**
    * Methods with variable arguments(...) can be overloaded, but the compiler uses the most
   specific method based on the argument list.
    ```java 
    void process(int number) { ... }
    void process(int...numbers){ ... }
   ```
   * When calling the `process(5)`, the compiler will choose the method with the single
   parameter over the varargs version. 

**NOTE!**: Method signature is combination of a method name plus the list of parameters.
In short, method overloading is creating multiple methods with same name different method
signature in the same class.
   
## Constructor Overloading
- Constructors are **special methods** used to initialize objects. Like regular methods,
constructors can be overloaded by providing different parameter list.
  - Overloaded constructors allow you to create objects with different initial states, providing
  flexibility in object creation. 
```java
          public class Car {
      String color;
      int year;
      // Default constructor
      public Car() {
          this.color = "Unknown";
          this.year = 0;
      }
      // Constructor with one parameter
      public Car(String color) {
          this.color = color;
          this.year = 0;
      }
      // Constructor with two parameters
      public Car(String color, int year) {
          this.color = color;
          this.year = year;
      }
}

```
* When we create a car object:
    - **`new Car()`**: Uses the no-argument(default) constructor.
    - **`new Car("Red")`**: Uses the constructor with one parameter and initializes the 
  color of the car object as `Red`.
    - **`new Car("Blue",2022)`**: sets both the color and the year, so it is calling the 
  two argument constructor.
    - **`new Car(45.71)`**: causes a compile error because there is no constructor that is 
  taking single double value as parameter.
    - **`new Car('a',"b")`**: causes a compile time error because there is no constructor
  matching the given parameter list.

# Summary
- **Method Overloading:**
  - Allows multiple methods with the same name in a class, differentiated by their 
  parameter lists.(number of parameters or type of parameters, order of parameters or all).
- **Key Rules**
    - The parameter list must differ.
    - The return type is **not** considered.
    - Access modifiers and thrown exceptions **do not** affect the method signature.
    - Overloading applies to both **`static`** and **`instance`** methods.
    - Varags can introduce complexity, so use it carefully.
- **Constructor Overloading**
    - Follows the same rules as methdo overloading, allowing differnt ways to initialize object
  depending on the parameters provided.
  
## NOTE!
**Method overloading is called compile time polymorphism**.
* **Polymorphism** is one of the 4 concepts of Object Oriented Programming.
* The other 3 is Encapsulation, Abstraction, Inheritance.
  
# this()
* **`this()`** is used to call other constructors in the same class.
* By providing different number of parameters we could choose which constructor is going to 
be called.
* It  MUST always be in the first line of the constructor and can only be used once in a
constructor. 



