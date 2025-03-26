
# `Assignment, Reassignment`
- The assignment operator `=` is used to store a value in a variable. it assigns
the value on the right side of the operator to the variable on left.
```java
int number = 7; // Variable number is assigned with value 7.
int num; // variable num is declared
num = 10; // variable num is assigned with value 10.
```
- Reassignment is when we change the value of a variable after the 
first initialization.
```java
double area = 48.5;

area = 22.75; // we re-assigned the value of area and from this line on
// the value of the area will be -> 22.75
```
- **NOTE!** We could re-assign and change the value of a variable, however
the data type of a variable is permanent and cannot be changed.

# `Compound Reassignment Operators`
- Compound assignment operators are a shorter way of writing expressions 
where a variable is modified and the reassigned with a new value.
    1. **`+=`**
        - This operator will add and then reassign the value.
        ```java
            int x = 4;
            x += 10; 
            // What is the value of x? 
            // x+=10; is the same thing as x = x + 10;   
            // 14     
        ```
        - `var += 3;` **is the same as** `var = var + 3;`
    2. **`+=`**
        - This operator will subtract and then reassign the value.
        ```java
            int x = 11;
            x -= 3; 
            // What is the value of x? 
            // x-=3; is the same thing as x = x - 3;   
            // 8     
        ```
        - `var -= 4;` **is the same as** `var = var - 4;`

    3. **`*=`**
        - This operator will multiply and then reassign the value.
        ```java
            int x = 4;
            x *= 10; 
            // What is the value of x? 
            // x*=10; is the same thing as x = x * 10;   
            // 40     
        ```
        - `var *= 3;` **is the same as** `var = var * 3;`
    4. **`/=`**
        - This operator will divide and then reassign the value.
        ```java
            int x = 32;
            x /= 11; 
            // What is the value of x? 
            // x/=11; is the same thing as x = x / 11;   
            //  2    
        ```
        - `var /= 5;` **is the same as** `var = var / 5;`
       
    5. **`%=`**
        - This operator will add and then reassign the value.
        ```java
            int x = 41;
            x %= 9; 
            // What is the value of x? 
            // x%=9; is the same thing as x = x % 9;   
            // 5     
        ```
        - `var %= 3;` **is the same as** `var = var % 3;`
---

# Boolean Data Type
- The boolean data type is a primitive type that can store **TWO** possible values:
**`true`** OR **`false`**. This data type typically used for decision-making in 
programs such as checking conditions and **controlling** the **flow of code**.
### Usage of Boolean Type
- Boolean variables are often used to represent the outcome of **logical** conditions.
- To create a simple `boolean` variable:
    ```java
     boolean isEmpty = false;
     boolean canPass = true;
    ```
## Comparison Operators
* Comparison operators are used to compare two values. These comparisons yield
a boolean result (`true` or `false`). The result of the comparison operators can
be stored in boolean variable or used directly in **conditional** statements like
`if`,`for`, `while` etc.

|   Operator          | Symbol | Description                            | Example   | Result |
|---------------------|--------|----------------------------------------|-----------|--------|
| Equal To            | `==`   | Checks if two values are equal         | `4 == 4`  | true   |
| Not Equal To        | `!=`   | Checks if two values are not equal     | `4 != 4`  | false  |
| Greater than        | `>`    | Checks if the left value is greater    | `11 > 7`  | true   |
| Less than           | `<`    | Checks if the left value is smaller    | `7 < 11`  | true   |
| Greater or equal    | `>=`   | Checks if the left is greater or equal | `14 >= 14`| true   |
| Less or equal       | `<=`   | Checks if the left is smaller or equal | `21 <= 30`| true   |











