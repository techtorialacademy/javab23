# Inheritance in Java
- Inheritance is a mechanism in Java that allows one class(called subclass, child)
to acquire the properties and behaviors of another class(called super class,
parent class.). It is a way to reuse code and model real-world relationships.
1. IS-A Relationship(Inheritance)
    * This is when one class inherits from another using the `extends`(`implements`)
   keyword
    * Essentially, if `Dog` extends the `Animal` class, we say `Dog` is an `Animal`.
    * An `IS-A` relationship implies that the subclass can do everything the superclass
   can, plus potentially more.
    ```java
      class GymEquipment{
   
      }
      class Treadmill extends GymEquipment{
   
    }
    ```
    * In the example code above we can say Treadmill is a GymEquipment
   because `Treadmill` class extends the `GymEquipment` class.
2. HAS-A Relationship
    * THis relationship is about using or containing an instance of another class
   rather than  inheriting from it.
    * If a class `Car` has an instance of `Engine`, we say the Car has an engine.
    ```java
      class Engine{
   
      }
      class Car{
        // Engine attribute
       Engine engine;
       public Car(){
        engine = new Engine();
   }
   }
    ```

## The `extends` Keyword
1. Syntax
```java
public class Parent{
    
}

public class Child extends Parent{}
``` 
    * The keywrod extends indicates that Child is inheriting from Parent.

2. Single Inheritance 
    * Java doesn't allow a class to inherit from more than one class. In other words,
   you cannot write `class Child extends Parent1, Parent2{}`(this is not possible)
    * However, a class can inherit multiple **`interfaces`** using the 
   **`implements`** keyword.
3. Accessing Superclass(Parent) Members
    * A subclass can access **all** the `public` and `protected` members of 
   its parent class.
    * Private members are not directly accessible.
4. Calling the super class constructor
    * The first line of a subclass's constructor can call the parent's constructor
   using `super()`.
    * If you do not call `super()` explicitly, Java automatically inserts and 
   calss parent constructor.

## The Object Class
1. Inheritance from **`Object`**
    * In Java, **every class** you create (directly or indirectly) inherits
   from the built-in `Object` class.
    * If you write `class MyClass{}` without any `extends`, under the hoos
   it's `class MyClass extends Object{}`.
2. Methods Inherited from Object
    * Common methods **all** classes inherit include:
        1. `toString()`
        2. `equals(Object object)`
        3. `hashcode()` 
        4. `notify()`, `notifyAll`
        5. `wait` overlaoded methods
    * You can **override** these methods to provide -class-specific- behavior.
   For example, givin a custom implementation of `toString` method for nice 
   print out format. 

### Rules & Notes
1. **Single Class Inheritance**
    - A class can only extend one other class.
2. `implements` vs `extends`
    * `extends` is used to inherit from a class or to inherit from one interface
   to another interface.
    * `implements` is used from class to inherit implementations of abstract methods.
3. **Overriding vs Overloading**
    * Overriding a method means providing a new implementation in the subclass that 
   has the same method signarture(name, parameters, return type) as in the parent class
   * Overloading means creating a method with the same name but different parameters.
   









