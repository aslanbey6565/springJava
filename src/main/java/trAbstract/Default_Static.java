package trAbstract;

public interface Default_Static {
    //Interfacelerde sadece abstract methodlar bulunur


    void method1();

    public default void method2(){ // burada kullanilan defaul acces modifier degildir.Cunku Interfacelerde tum methodlar public ve abstractir
        System.out.println("Interfacedeki default method");
    }
    static void method3(){
        System.out.println("Interfacedeki static method");
    }

}
