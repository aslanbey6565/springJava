package day23;


public class Mammal extends Animal {

    public Mammal(){
        super("Woow");
        System.out.println("Mammal const worked....");
    }
    public Mammal(int num){
        super("Hi");
        System.out.println("Mammal const with int parametre worked");
    }
    public Mammal (String s){
        this();
        System.out.println("Mammal const. with String parameter worked...");
    }
        }