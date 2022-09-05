package trStaticKeyword;

public class StaticBLOCK {

    /*
        Static variablelara deger atamasi yapmak icin kullanilir
        Ilk calismaya basladiginda calisir ve ilk deger atamasi yapar
        Static blocklar herseyden once calisir
        Birden fazla block varsa en ustteki once calisir
     */





    public  static int age;

    static {
        System.out.println("Static block 1 calisti");
        age=33;
    }
    public  StaticBLOCK() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main met calisti");
        System.out.println(++age);
        StaticBLOCK obj = new StaticBLOCK();
        System.out.println("Main method calisti");
    }

}
