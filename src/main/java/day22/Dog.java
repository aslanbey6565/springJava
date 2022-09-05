package day22;

public class Dog extends Mammal{

    public Dog(int i) {
        super(14);
    }

    @Override
    public void eat() {
        super.eat();//"super" keyword means "parent class"
        System.out.println("Dogs are animals so they eat as well...");
    }

}