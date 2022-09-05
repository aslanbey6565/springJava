package day23;

public class Cat extends Mammal{

    public Cat(){
        super(12);// super() must be in the first line in constructor body
                      // In a constructor body you can do just a single const. call, multible calls are not allowed
        System.out.println("Cat const worked");
    }

    public Cat(boolean b){
        super();
        System.out.println("Cat constructor with boolean paremeter worked");
    }


}
