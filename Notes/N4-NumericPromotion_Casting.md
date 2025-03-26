# Numeric Promotion
- Numeric promotion in java happens when a smaller data types (like `byte`,`short`, or
`char`) used in arithmetic operation.When these small data types used in arithmetic
operation Java automatically converts these data types to `int`.
- Java promotes numbers to avoid possible data loss and ensure calculations are correct.
    * Example to a possible data loss scenario and how java avoids it
        ```java
            byte n1= 120; // 
            byte n2= 100;
             // byte can store values between -128 to 127 so 
             // no problem when storing variables with given values.
            // If java tried to store addition of n1 + n2 as a byte it would have
            // lost anything over 127 and would give the result as 127.
           // By promoting result of `n1 + n2` to `int` java can find the correct 
            // answer and find the result as 220.
        ```
## Numeric Promotions can happen in 3 situations:
    1. **Byte,Short, and Char** is used in arithmetic operation
        - When the data types above used in arithmetic operation Java automatically
        converts to **`int`**.
    2. Smaller type To Bigger Type
        - If two different types of primitive used in arithmetic operation the 
        smaller data type gets promoted to a larger data type.
        (`byte`,`short`,`char`) -> promoted to -> (int) -> (long) -> (float) -> (double)
    3. Integer number to Floating point:
        - If an **integer type** like (`int` or `long`) is used with a floating point
        data type like (`double` or `float`), integer types will get promoted to 
        floating point types.
        - (int) -> (long) -> (float) -> (double)

### Summary of all numeric promotion is:
---
**`(`byte`,`short`,`char`) -> promoted to -> (int) -> (long) -> (float) -> (double)`**
---
### NOTES for NUMERIC PROMOTION
- Java automatically promotes smaller data types to larger data types when performing
operations.
- `byte`,`short` and `char` always become `int` expressions.
- The **largest data type** in an expression determines the **final type**
- **Integer types** (long and int) will automatically promoted to decimal types
like `float` or `double`.


* Numeric promotions happen automatically by Java, however if we want
we could **force** the final data type we would like to achieve. 
* To be able to get the data type we would want we could use **casting**.
* Since we are forcing specific data type to be the end result, we could 
face with potential data losses. Therefore, we have to be careful when 
casting the data types.

---
**Note from the day**:
- It is not possible to store numbers without decimal points in `float` or `double`.
    ```java
        float f1 = 5f;
        double d1 = 6; 
        System.out.println(f1); // 5.0
        System.out.println(d1); // 6.0
         // in `float` or `double` only decimal values are stored.
    ```
  
