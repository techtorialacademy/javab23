# Polymorphism
- Polymorphism means many forms.
- In object-oriented programmin, it referes to the ability of single reference
type to behave differently based on the actual object that the reference i
pointing to. 
* IN JAVA,  there are two types of polymorphism:
    1. Static polymorphism(Method Overloading)
    2. Dynamic polymorphism(Method Overriding)
## Static Polymorphism
* Occurs when multiple methods in the **same class** have the same name but
different paremeter lists.
* It is called static because it is resolved at the compile time. 
```java
public class SmartDevice{
    public void displayInstructionManual(){
        System.out.println("Displaying basic instruction manual");
    }
    public void displayInstructionManual(String language){
        System.out.println("Displaying basic instruction manual in " + language);
    }
}
```

## Dynamic Polymorphism(Method overriding)
* Occurs when a child class provides its own implementation for a method 
already defined by its parent class.
* It is called dynamic because it is decided at the run time. The JVM looks at the 
actual object(child or parent) that a reference points to and calls the appropriate
implementation.
#### Overriding Rules
1. The method in the child class must have the same signature(name, parameters,
and return type.) or a covariant return type.
    * Covariant Type means, subtype of the object.
2. The overriding method must be at least as accesible as the parent version.
    * Access modifiers from least accessible to most accessible 
   -> `private` -> default/no access modifier -> `protected` -> `public`
    * `private` methods CANNOT be overriden as they are not accesible from
   outside the class.
3. Marking a parent method as `final` perevents overriding.
4. Optionally, you can use `@Override` annotation in child to make your 
intention clear and catch errors quickly at compile time. 
---
# Polymorhic Objects
```java
// SmartWatch -> WearableSmartDevice -> SmartDevice -> Object
// Child          ...->...->...           Parent
// Subclass       ...->...->...           Superclass

SmartDevice d1 = new SmartDevice("techno", 68);
// Access all SmartDevice methods & fields

SmartDevice smartWatch = new SmartWatch("WritInova", 58, "leather", true);
// Access SmartDevice methods, but from an actual SmartWatch object
```
1. **Parent Reference; Child Instance
    * `SmartDevice smartWatch = new SmartWatch(...)` is the classic 
   polymorphic scenario.
    * The **reference type** is `SmartDevice`, but the actual object is
   `SmartWatch`.
2. **Access to Overidden Methods**
    * If `SmartWatch` overrides a method declared in `SmartDevice`, calling that
   method on the `SmartDevice` reference will invoke `SmartWatch`'s version.
      (this is **dynamic binding** )
3. **Reference Type Limitation**
    * You can **ONLY** invoke methods that exists in the `SmartDevice` class.
      (the type of the reference)
    * Any **child specific methods or fields** are not accessible through the
   Parent reference.
4. **Why Not the Other way around?**
    * `SmartWatch sw = new SmartDevice("device", 25);`  is invalid,
   because not `SmartDevice` is a `SmartWatch`.
    * Polymorphism only works from **more general** to **more specific** in the
   actual object.
---

## Summary
* Inheritance (the `IS A` relationship) provides the basis for the 
**dynamic polymorphism**.
* **Method Overriding** is how polymorphic behavior is achieved at runtime.
* **Method Overloading** in the same class is **static polymorphism**.(resolved
at compile time.)
* A polymorphic object typicall means **parent reference** pointing to a child
object, leveragin dynamic dispatch of methods.
* You gain the overriden behavior from the child class but lose direct access to
any **child specific** methods, **UNLESS** you cast the reference back to the 
child type.

