package Objects;

public class CalculatorTest {


    public static void main(String[]args){

        // Create an instance/object of the Calculator class.

        Calculator calculator = new Calculator();

        // Let's define the attributes/properties/instance variables of the calculator object.
        calculator.brand = "Tech";
        calculator.productionYear = 2023;

        // Let's try to find sum of 2 double values

        calculator.findSum(4.1,3.1);
        // What do I expect to see as output of the code?
        // Nothing because we haven't printed or do anything with the returned value.

        // You could directly print returned value
        System.out.println( calculator.findSum(4.1,3.1));

        // findSum method returns a double value
        double result = calculator.findSum(4.1,3.1);
        // result variable will be assigned with a returned value from the
        // findSum method.
        // By this way we get the returned value and use it as we wish/need.

        System.out.println("The value of the variable result is " + result);

        // Not just values, but also a variable names with matching data type can
        // be passed as parameter.

        double number1 = 10.72;
        double number2 = 41.7328;

        double sum = calculator.findSum(number1,number2);

        System.out.println("number1 + number2 is " + sum);

    }


}
