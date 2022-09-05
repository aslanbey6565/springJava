package trOverriding;

import jdk.swing.interop.SwingInterOpUtils;

public class Cadillac extends Gmc{

    protected String hiz= "Cadillac Arabalar 400km  hiz yaparlar";
    protected String yakit="Cadillac benzin veya elektriklidir";
    protected String model="Cadillac";
    public void motor(){
        System.out.println("Cadillac Arabalar cevre dostu motor kullanirlar");
    }
    public void yakittuketimi(){System.out.println("Cadillac arabalar 6 silindire sahiptirler");}
    public void vites(){
        System.out.println("Cadillac arabalar 6 vitestir");
}


       /*
         DATA TURU VE CONST FARKLI OLDUGUNDA
         cONSTURCTOR CALISTIGI ICIN OBJE
         CONST. OLDUGU CLASS OZELLIKLERINI TASIR.
         ANCAK DATA TURU PARENT CLASS SECILDIGI ICIN
         VERIABLELER DATA TURUNUN SECILDIGI CLASS VE
         ONUN PARENT CLASSLARINDAN DEGER ALABILIR

       */
    public static void main(String[] args) {
        Cadillac arb1 =new Cadillac();
        System.out.println(arb1.hareket);
        System.out.println(arb1.hiz);
        System.out.println(arb1.yakit);
        System.out.println(arb1.marka);
        System.out.println(arb1.sirketmerkezi);
        System.out.println(arb1.model);


        Gmc arb2 = new Cadillac();
        System.out.println(arb2.hareket);
        System.out.println(arb2.hiz);
        System.out.println(arb2.yakit);
        System.out.println(arb2.marka);
        System.out.println(arb2.sirketmerkezi);
        //System.out.println(arb2.model); // CTE
        arb2.motor();


         Arabalar arb3 = new Cadillac();
        System.out.println(arb3.hareket);
        System.out.println(arb3.hiz);
        System.out.println(arb3.yakit);
        System.out.println(arb3.marka);
        //System.out.println(arb3.sirketmerkezi); //CTE
        //System.out.println(arb3.model);//CTE





    }
}
