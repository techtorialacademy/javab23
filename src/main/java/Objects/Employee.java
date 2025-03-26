package Objects;

public class Employee {

    // We are creating a class for representing a working employee for a Company Y.
    // We are going to decide whether something is going to be static or not by
    // looking whether all instances share the same value or not.
    static int numberOfEmployees;
    static String companyName;

    String employeeID;
    String departmentName;
    int salary;
    String name;

    // Let's create a constructor that will assign a name, department, id and salary to employee.
    // When a local and a global variable shares the same name the local one is called first.
    // this means from the instance variables. this always refers to the instance properties or methods.
    public Employee(String employeeID,String departmentName,String name,int salary){
      // instanceVariableEmployeeID should be assigned with employeeID value from parameter
        this.employeeID = employeeID;
        this.departmentName = departmentName;
        this.name = name;
        this.salary = salary;
        System.out.println("4 argument constructor is called.");

    }

    public Employee(){
        System.out.println("No argument constructor is called.");
    }













    // Let's create a method to calculate a %10 bonus for an employee
    public void addBonus(){
        int bonus = this.salary / 10;
        System.out.println("Bonus for the employee " + this.name + " is $" + bonus + ".");
    }

    public void addBonus(int bonusPercentage){
        // If the bonusPercentage was 30
        // To find 30 percent of the salary I need to divide by 100 then multiply by 30
        // To find the bonus I have to divide by 100 and then multiply by bonusPercentage
        int bonus = this.salary / 100 * bonusPercentage;
        System.out.println("Bonus for the employee " + this.name + " is $" + bonus + ".");
    }

    // addBonus is overloaded














}
