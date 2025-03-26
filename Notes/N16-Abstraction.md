# Abstraction
- Abstraction is the concept of hiding details and highlighting only the
necessary information or behavior.
- In Java, it typically involves creating **abstract** classes or 
**interfaces**. These abstract classes or interfaces define methods and behaviors
without necessarily providing full implementations in the same place.

## Abstract Classes
1. Cannot be instantiated
    * You cannot create objects from abstract class; they are meant to be 
   extended other classes.
2. May contain both abstract and concrete methods
    * Abstract methods have only a method signature(no method body.)
    * Concrete methods in the same class have full implementations.
3. Constructors
    * An abstract class **can** have constructors.(Often used to initialize
   common fields.)
    * Even though you can't instantiate abstract class itself, the subclass
   can call **`super()`** to initialize shared fields.
4. Usage
    * Typically used when you have a base class with shared fields/methods but
   you also want to force subclasses to implement certain behaviors in their own
   way. 
* **Example Syntax of Abstract class**
    ```java
    public abstract class AbstractClass{
  
        }  
  ```
## Interfaces
* These are java files like classes but not class.
* Syntax
    ```java
    public interface test{
  }

  ```
1. All methods are public by default
    * All the methods created in interfaces are public by default.
2. No Constructors
    * An interface cannot be instantiated directly. You implement it in a class.
3. Fields in Interfaces
    * By default, all fields are `public static final`. This means they are 
   constants.
4. Multiple inheritance of interfaces
    * A class can implement any number of interfaces, unlike a single inheritance
   for classes.
5. Use an interface to define a contract(methods) that multiple classes
can implement, possibly in different ways.

## OOP SUMMARY
**Encapsulation**: Encapsulation bundles data(fields) and related methods
into a single unit, limiting direct access to internal details. By using
access modifiers like private for fields and public for access methods.
Private fields, public getters and setters with logic if needed.
---
**Abstraction**: Abstraction hides the complex implementation details behind a
simpler interface. Classer or interfaces present only essential feature to the 
outside world, so users interact with what's necessary.
---
**Inheritance**:Allows one class(subclass/child) to acquire properties and 
methods of another class(parent/superclass).
---
**Polymorphism**: Allows one interface or reference type to represent multiple
actual types. In java, this typically shows in method overriding(dynamic)
and method overloading(static).












