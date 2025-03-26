package Objects;

public class EmployeeTest {

    public static void main(String[]argS){

        // Let's create an employee object
        Employee e1
                = new Employee("E0001","IT","John",91230);
        Employee e2
                = new Employee("E002","IT","Jane",125055);

        System.out.println("Name of the employee e1 " + e1.name);

        e1.addBonus();

        e2.addBonus();

        Employee.companyName = "TestingSoftware";

        System.out.println(e1.companyName);
        System.out.println(e2.companyName);

        // Althought it is possible to access static variables using objects,
        // it is better to do it with class name.
        System.out.println(Employee.companyName);


        // Right now we have 4 argument constructor and no-argument constructor
        Employee e3 = new Employee();
        // Since I didn't provide any value when calling the constructor,
        // it will use no-argument constructor.

        Employee e4 =
                new Employee("E0004","Finance","Eve",57000);

        // When there is more than one constructor for the class, then number(combination) of
        // parameters you provide will determine which constructor to be called to create an object.
        // Creating more than one constructor is called OVERLOADING the constructor.


        // We could also overload the methods

        System.out.println(e4.name + " salary: " + e4.salary);

        // if I call addBonus methods:
        e4.addBonus();
        e4.addBonus(12);








    }



}
