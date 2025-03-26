# String

## What is an Object in Java? 
- An object in Java is an instance of a class that has state(attributes,fields) and
behavior(methods).
- String in Java is an **object** because it is an instance of the `String` class,
which has both attributes, and methods.

## Features of String
* **Immutable**
    * Once a `String` object is created it cannot be modified. Any modification
   creates a new `String` object.
    * This immutability improves security, make String objects `thread-safe`, and helps
   with memory optimization.

## Using String
1. Creating a String Object
    ```java
        String s = "Welcome to String Object";    
    ```
2. String Object Uses **Indexes** To Access Each Element
    ```java
        //            0123     -> These are the index numbers
        String str = "Java";
        // First letter in string will have the index number -> 0
        
       // What is the length of the given string above? (Number of characters in string)
       str.length(); // -> 4
   
       // What is the index number of the last character? 
       // 3
   
        // Index number of the last character in string will always be 1 less than
        // the length of the string.
    ```
   ```java
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // Getting string input from user. ()
        
        // What is the index number of last character in the string word? 
        int indexOfLastChar =  word.length() - 1;
   ```
   