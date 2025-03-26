# What is a constructor? 
* **Initialization Method**: It sets the initial state of an object by assigning values to
to instance variables.
* **Same Name as the Class**: The constructore's name **must** match the class name, and it 
mustn't have a return type. 
## When a Constructor Is Called? 
* **Automatically on Object Creation**: When you use the **`new`** keyword to create an object,
the constructor of the class is automatically called.

## Example
* Let's create a car class with a constructor:
    ```java
        public class Car{
        // Create instance variables
        int modelYear;
        String brand;
        String color;
  
        // I want car object to always have brand and modelYear assigned
        public Car(String theBrand, int theModelYear){
              brand = theBrand; // theBrand value given when the constructor is called, will be 
  // assigned to the brand attribute of  the object.
               modelYear = theModelYear;
            }
  
   // Let's create a main method here and see how this constructor behaves
   public static void main(String[]args){
         Car car = new Car("ford",2022);
          // for the car object/instance created above, the instance variable brand and 
  // modelYear will be assigned with given values.
          System.out.println(car.brand); // ford
          System.out.println(car.color); // null
  // because we haven't assigned value for color attribute of the car object/instance.
        Car car2 = new Car("Chevrolet",2024);
        
        System.out.println(car2.modelYear); // 2024
        System.out.println(car.modelYear); // 2022
  
            } 
  
        }

    ```
  
## Why Is It Used and Important? 
- **Setting Up Objects**: It ensures that an object starts its life with a valid state.(Such as,
giving car object a brand name and a model year)
- **Avoiding Errors**: By initializing instance variables, it prevents the issues that might arise 
from using uninitialized data.

# Static Keyword
- **`static`** keyword in java is used to declare members(variables and methods) that 
belong to class itself rather than any particular instance(object) of the class.

# Static Variables
- A **`static`** variable shared among **all instances** of a class. There is only one copy(value)
of a static variable, regardless of the number of objects(instances) from that class. 
- **Behavior**: 
    * **Shared State**: If one object modifies a static variable, the change is visible to all
  other objects.
    * **Access**: You can access a static variable **directly** by using **class name**. 
  Such as, `Classname.variable`, which makes it useful for definining constants or common data 
  among **all instances/(objects)**. 
  
```java
public class Counter{
    // Static variable shared by all instances.
    // Static variable will have the same value for every object out of this class.
    public static int count = 0;
    
    // Instance variable unique to each object
    public int id;
    
    public Counter(int idValue){
        id = idValue;
        count++;
    }
}
// In this example, no matter how many `Counter` objects you have,, there is just one 
// `count` that keeps track of the total number of instances. 
```

# Static Methods
- A static method belongs to the class rather than any specific object. It can be 
called(used) without creating an instance(object) of the class.
- They are often used for operation that do not depend on instance-specific data.

```java
public class MathUtils{
    // Static method for calculating the square of the numbers
    public static int square(int number){
        return number * number;
    }
    
    public static void main(String[]args){
        
        int square = MathUtils.square(7); // 49
    }
    

}

```

## Comparison Static vs Non-Static
* Instance Variables:
    - Unique per object: Each object has its own copy(value).
    - Access: Must be accessed through an instance(object) of the class.
* Instance Methods:
    - Object-Specific Behavior: They can use instance variables and update the state of 
  objects(instance).
    - You need to create an instance of the class to call non-static methods.
* Why Choose One over Other?
    * **`Static`**: Use when you need a property or behavior that is common to **all** instances
  of the class. Configuration settings, utility methods etc. 
    * **`Instance`**: Use when each object needs to maintain its own state or behavior.













