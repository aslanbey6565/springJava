package trInHeritance;

public class Memur extends Muhasebe {


    public static void main(String[] args) {

    Memur memur1 = new Memur();

    //personel classtan
    memur1.isim="Burhan";
    memur1.soyisim="Aslan";
    memur1.adres="Mersin";
    memur1.tel="0312654654301";

    //Muhasebe Classtan
    memur1.saatucreti=50;
    memur1.maas=memur1.maasHesapla();
    memur1.statu="Tester";
        System.out.println(memur1);

        Memur memur2 =new Memur();
        memur2.persNo=1025;
        memur2.saatucreti=35;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);


}
    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
