package trInHeritance;

public class Child01 extends Parent{

    public static void main(String[] args) {

        /*
            Child class obje olusturmaya gerek kalmadan
            parent classtaki variable ve methodlara ulasabilir
         */
        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();
    }
}
