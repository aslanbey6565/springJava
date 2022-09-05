package trInheritanceOverriding;

public class Ustabasi extends Isci{

    String statu="Ustabasi";
    String haklari="Ustabasi haftada 1 gun fazla tatili var";

    public void mesai(){
        System.out.println("ariza varsa extra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("ustabasi 8*30*17" + (30*8*117)+ "maasla calisir");
    }

    public static void main(String[] args) {
        //icinde olunan classtan bir obje olusturarak
        // variable ve methodt cagirimlarinda once
        // icinde bulunan classa bakar ve getirir.
        // Yoksa, parent classlara bakar ilk buldugunu getirir.
        Ustabasi burhan= new Ustabasi();
        System.out.println(burhan.statu);
        System.out.println(burhan.haklari);
        System.out.println(burhan.ikramiye);
        System.out.println(burhan.izinler);
        burhan.maasHesapla();
        burhan.mesai();

        //Eger isci olarak ozelliklerini gormek istersek class adini (data turunu) isci secmelisiniz
        Isci ahmet= new Ustabasi();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.haklari);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izinler);
        ahmet.maasHesapla();
        ahmet.mesai();

        Personal adem= new Ustabasi();
        System.out.println(adem.statu);
        System.out.println(adem.haklari);
        //System.out.println(adem.ikramiye); // personel classi baska bir classin childi olmadigindan data yoksa CTE VERIR
        System.out.println(adem.izinler);
        adem.maasHesapla();
        adem.mesai();
    }
}
