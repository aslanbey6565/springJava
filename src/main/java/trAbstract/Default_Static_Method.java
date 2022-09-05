package trAbstract;

public class Default_Static_Method implements Default_Static{

    /*
       Bir interfacede default veya static olan ve bodysi olan methodllarin
       override edilmesi mecburi degildir
     */
    @Override
    public void method1() {
        System.out.println("Child class method1");

    }

    public static void main(String[] args) {
        //Static olarak tanimlanan methodlara static yontemlerle ulasilabilir = InterfaceIsmi.methodismi
        Default_Static.method3();

        Default_Static obj =new Default_Static_Method();
        obj.method1();// Child Class
        obj.method2();//Parent Interface


    }
}
