
# Classes

# Objects 

## Instance Variables

## Methods
- A method is a block of code designed to perform a specific task
when it's called.
  - Block of code refers to codes inside the `{}`(Curly Braces).
- It encapsulates behavior that can operate on the data(instance variables)
of the object.
### **Key Parts Of A Method**
1. **Method Signature(Header)**
    * **Access Modifier**: Specifies the accessibility range of the method.
        - `public`: Accessible from anywhere in the project.
        - `protected`: Accessible within the same package, and from all child(sub) classes.
        - `default`(No Access Modifier): Accesible **only** within the same package.
        - `private`: Accessible **only** in the same class.
    * **Return Type**
        - Indicates what type of value the method will return.
        - For example, `int`,`String`, `boolean` or for no return value `void`.
    * **Method Name**
        - The identifier for the method. It should be descriptive of the method function.
        - Same rules apply as variable naming.
    * **Parameters(Optional)**: Variables passed to the method to work with. These acts
   as inputs to the methods.
2. **Method Body**`{}`
    * This is enclosed with `{}`curly braces and contains the code that runs
   **when the method is called**.
    * It may include **local variables**(temporary data used only inside the method).
    * If a method has a return type(not **`void`**), it **must** include **`return`**
   statement.

3. **Example of Method In Java Class**
    * ```java 
       public class Car{
       // Instance variable(property of the Car objects)
       String color;
       // let's define a behavior for Car objects
      public void drive(){
          System.out.println("Car is driving.");
      }
      }
      ```
   * **Example with Parameters**
    ```java
     public class Calculator(){
         String brand;
         String color;
         int productionYear; 
         int warrantyEndYear; 
         int age; 
          
     // let's create a method that will return true if the calculator is 
   // still under the warranty
         // productionYear + age should be smaller than warranty end year
         // SO I know that product is still under the warranty
   public boolean underWarranty(){
     boolean isUnderWarranty = productionYear + age < warrantyEndYear;
     return  isUnderWarranty;
   }
   
   // Calculator object should be able to calculate sum of given 2 numbers and return
   // the sum.
   public int sum(int a, int b){
     // Find sum of given two integers which are represented by a and b
     return  a + b ;
   }
   // You want your sum method to work with any number of given integers
   // NOTE! Usage of 3 dots are useful when the number of parameters given is unknown.
   public int sum(int...numbers){
   // Those 3 dots in the parameter creates an array of given integers.
   int sum = 0;
   for ( int number: numbers){
    sum += number;
   }
   return sum;
   }
   
        
       
   
     }
   ```










