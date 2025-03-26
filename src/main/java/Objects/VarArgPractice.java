package Objects;

public class VarArgPractice {
    // Create a method that will take as many integer value
    // as given and will find the sum of those values

    // varargs are created by using 3 dots and will take as many value as given
    // and create an array of given values that could be used in the method.

    public int sum(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }

    // Create a method that will take as many string value as given and will print
    // each one in different line
    public void printValues(String...names){
        for(String name : names){
            System.out.println(name);
        }
    }


    public static void main(String[]args){
        int sum = new VarArgPractice().sum(4,3,2,5,6,9);
        System.out.println("Sum is " + sum);

        new VarArgPractice().printValues("name","hello", "java", "test", "programming");



    }





}
