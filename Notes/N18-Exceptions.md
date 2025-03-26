# 1. Throwable
- The top-level class for everything that can be thrown and caught. 
- All Errors and Exceptions extend the Throwable class.

# 2. Error
- Serious problems that the application generally cannot recover from. 
- OutOfMemory Error, StackOverFlowError etc.
- Typically we do not catch Error objects. They indicate system level or JVM 
level problem that we cannot fix it with our code.

# 3. Exception
- Represents conditions that might be handled and from which the application
may recover.
- IOException, SQLException, IndexOutOfBoundsException etc.
- There are 2 types of exceptions:
    1. **Checked Exceptions**:
        - Exceptions that must be either:
          * Caught with a `try/catch` block
                      OR
          * Declared in method signature.
    2. **Runtime Exceptions(Unchecked)**:
        * Exceptions that the compiler **doesn't force yout to handle or declare**.
        * `NullPointerException`,`IndexOutOfBoundsException`...
## Handling Errors and Exceptions
1. **`try/catch `**
* When you suspect a block of code might throw an exception, you can wrap it
in a `try` block and handle it in a `catch` block:

```java
// Let's say we want to read a file, which we know possibly can throw an exception.

import java.io.FileNotFoundException;
import java.io.IOException;try{
//Code that might throw an exception
FileReader fileReader = new FileReader("example.file");
        }
                catch(Exception e){
        // If this block of code runs it means that the try block has failed and
        // throw and exception.

        }catch(IOException e){}
        catch(Exception e){
        }
```
* **Try/Catch** Block rules
    1. In a `try` block you should write a code that you think might throw 
  an exception. 
   2. Then in the catch block, write which exception you want to catch
  from more specific to general.
  3. You could add `finally` block after a `catch` block, which will always
  be executed whether the try block is successful or not.
  4. 











