package trInheritanceCallConstructor;

public class Child extends Parent{

    Child(){
        System.out.println("Child const calisti");
    }
    // Tum classlarda biz gormesekte
    // Javanin olusturdugu default constructor vardir
    // Extend keyword kullanan classlardaki
    // tum Constructorlarin ilk satirinda biz gormesekte
    // super() constructor call vardir.
    // yani parent classin parametresiz const call.

    public static void main(String[] args) {
        Child child = new Child();
    }
}
