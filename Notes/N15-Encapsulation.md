# Encapsulation
- Encapsulation is the bundling of data(fields) and methods (behaviors)
into a single logical unit(class.)with mechanisms to restrict direct access to 
some components.
- Goal: Hide the internal implementation details from the outside world and 
expose only the required values.

## Rules
1. Use access modifiers
    * Mark fields as `private` to restrict direct access from outside.
    * Provide `public`(or `protected`) **getter** and **setter** methods
   to control how external code reads or modifies the fields.
2. Control Data Validity
    * Encapsulation allows you to **validate** data before changing it.
    * For instance, in a `setAge(int age)` method, you can ensure the value 
   is non-negative.
3. Separate Concerns
    * Keep internal working logics hidden. External classes should interact with
   your class via public methods rather than directly manipulating fields.

# **`final`** Keyword in Java
## 1. **`final`** for variables
    * Once a `final` variable is assigned with a value, its value cannot be
changed.
    * It could be used for instance variables, local variables and static variables.
```java
final int num = 11;
num = 12; // Causes compile time error as the declared as final and its value 
// cannot be changed.
```
## 2. **`final`** for methods
    * A `final` method **cannot** be overriden.
    * Often used to prevent subclasses from altering core behaviors.
```java
public final void showDetails(){
    // this method cannot be overriden.
}
```
## 3. **`final`** for classes
    * A `final` class **cannot** be extended. No subclasses can be created from
a `final` class.
    * Ensures the class's desing and functionality remain unchanged in inheritance
hierachies.
```java
public final class Utility{
    // No other class can extend Utility class.
    
}
```

## Summary
* **`final`** classes = cannot be subclassed
* **`final`** methods = cannot be overriden
* **`final`** variables = cannot be reassigned.

