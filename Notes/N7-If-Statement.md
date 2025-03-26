# If Statement 
- `if` statement is a conditional statement used to execute a block of 
code only if a specific condition is `true`. It's a fundamental tool for 
decision-making in programming, allowing programmers to control the flow 
of code based on different conditions.
- **Syntax**
    ```java
       if(booleanCondition){
        // code in between curly braces will be executed 
        // ONLY if the booleanCondition is true.     
            }    
        // code outside the if statement will be executed normally.
    ```
- **NOTE:** Code inside the `curly braces` is also referred as a 
**block of code**.
* **NOTE About Java Coding:** Java is not a space sensitive language.
as long as variable names, method names and keywords are written correctly
space doesn't matter. Do differentiate the codes, blocks, and statements
java uses `;` and `{}`.

# Else If Statement
- Else if statement is useful when there is multiple conditions to check.
You can add as many `else if` conditions as needed. In an if statement with
multiple `else if`, the **first** condition that evaluates to `true` will
execute, and the rest will be ignored.
- **Syntax**
    ```java
        if(condition1){
         // Code to execute when condition1 is true
        }else if(condition2){
         // Code to execute if condition1 is false and condition2 is true
        }    
    ```

```java
// Which line of the code below will be executed? 
if(false){
 // line1
}else if( true ){
 // line 2
}else if( true ) {
 // line 3
}
// line 4
```
# Else Statement
- If...else statement allows programmers to specify and **alternative block
of code** to execute when previous conditions are `false`.
* **Syntax**
    ```
        if(cond1){}
        else if(cond2){}
        else if(cond3){}
        else{
           // this else statement block gets executed ONLY
           // if all the previous conditions are false.
          // cond1 and cond2 and cond3 is false then this else gets executed.       
           }
    ```





















