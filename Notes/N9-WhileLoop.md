# While Loop
- The `while` loop is a control structure in *Java* that allows us to 
**repeat a block of code** as long as a specified condition is `true`.
The `while` loop is useful when the number of executions is not known
beforehand, allowing flexible, condition based repetition.
- **Syntax**
    ```java
    while( condition ){
  
    // code to be executed repeatedly as long as the condition is true.
  
        } 
   ```
  1. Java will execute the code in the loop body when the condition is true.
  2. When a single execution of a loop body is complete, that is called
  **iteration** of the loop.
  3. When an iteration is completed, then java checks the `while` condition again.
  4. If the condition is true, another **iteration** will be completed.
  5. This loop will continue as long as the condition stays `true`, therefore
  there **SHOULD** be a code in the loop body that would make the while condition
  false eventually.
  
