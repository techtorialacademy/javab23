package OOP.Encapsulation.Ex1;

public class TestEncapsulation {
    public static void main(String[]args){
        Person person1 = new Person("234erfg",-91);

        System.out.println(person1.getAge());
        System.out.println(person1.name);
        person1.setAge(159);
        System.out.println(person1.getAge());

        person1.setAge(42);

        System.out.println(person1.getAge());


    }
}
