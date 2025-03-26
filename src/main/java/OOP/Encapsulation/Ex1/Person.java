package OOP.Encapsulation.Ex1;

public class Person {
    String name;
    private int age;

    // To set the variables above we will create a constructor
    public Person(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 125 ){
            this.age = age;
            return;
        }
        System.out.println("Invalid age");
    }
}
