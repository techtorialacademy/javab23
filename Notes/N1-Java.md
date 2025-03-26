# File Extensions
* File extensions are the suffixes at the end of the file names. (e.g.,
`.java`, `.txt`, `.docx`, `.md`). These extensions tell the operating
system or programs what type of file they are and how to open these files.
* Common File Extensions:
    - .pdf
    - .png
    - .jpg -> .jpeg
    - .docx
    - .txt
    - .mp3
    - .img
    - .default
    - .md -> markdown files
---

# IDE 
* An IDE is software that helps you write, edit, and run code efficiently.
It's like a 'smart' text editor with extra tools for programming. 
* **Why Use and IDE for Java?** Java is a complex programming language, and 
IDE  simplifies the process by:
    * Highlighting errors in your code. 
    * Offering code suggestions and autocomplete.
    * Helping manage files and projects easily.
    * Allowing us to run Java codes easily by one click.
* **Why Intellij?**
    * A clean and user friendly.
    * Smart coding assistance.
    * It integrates with maven and gradle.
  
---

# Java
- **Java** is an object-oriented programming language used for automating
actions on a computer. It is known for its stability, portability, 
robutstness and widespread use in various applications. 
- Java is typically installed with **JDK**(Java Development Kit), which 
includes **JRE**(Java Run Time Environment) and
**JVM**(Java Virtual Machine).
  * **JDK**: Contains the tools and libraries needed for developing Java 
  applications. It includes the JRE and and JVM.
  * **JRE**: Provides the environment necessary for running Java code. It 
  contains the libraries and components needed to execute Java code. 
  * **JVM**: **Compiles** Java code into **machine-readable** code (binary
  code or 1's and 0's) so that it can be understood by the machine. This
  process makes **Java** **Platform Independent Programming Language**. 
  Which means same Java code can run on different machines without a problem. 

---

## To write a Java Code
### 1. **Create a Java File**
  * To create a Java file, you need a file with a `.java` extension.
  * However, in intellij we could do `right-click` under the **src** folder
and choose a Java file which adds the `.java` extension by default. 

### 2. **Define a Class**
  * Every program in Java must have a class. The class **must** be 
enclosed by curly braces.`{}`.
  * Example of a simple class:
    ```java
    public class HelloWorld{
    
    } 
    ```
  * Public class name **must** match the file name.

### 3. **Main Method**
  * To run a Java code, you need a **main method**. The main method acts 
as the engine of the program, telling Java application where to start 
executing.
  * **Syntax Of Main Method**
    ```java
    public class HelloWorld{
    
    public static void main(String[] args){
                 
    }

    }  
  
    ```
  * `public`: The access modifier make it accessible from everywhere.
  * `static`: Makes method belongs to a class and able to run.
  * `void`: This method will not provide(return) any value. 
  * `String[] args`: Parameter that this method can use.

### 4. **Displaying Output**
  * To show what the program does, we need to output results to the terminal.
This is done using the `System` class `out` object and `println` method.
  * In short to display output in Java use the syntax below:
    ```java
    System.out.println(); 
     ```
  * To display something you have to place in to the parantheses above.

### 5. **Printing Text and Calculations**
  * To display a text in Java, we **ALWAYS** place the text in 
double quotes.`""`. Every text that is placed in double quotes has a 
special name in Java which is **String**.
  * For the numerical values like 1,2,3,5.8 etc. we do not have to place 
them in double quotes. If we place these numerical values in double quotes
Java will treat them as text values. In short in Java 
`"5"` is not equal to `5`. `"5"` is a text(string) value but `5` is the 
numerical value.









ß*_k_*---






















