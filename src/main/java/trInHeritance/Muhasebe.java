package trInHeritance;

public class Muhasebe extends Personel2 {

    protected   int saatucreti;
    protected  String statu;
    protected  int maas;

 protected int maasHesapla(){


        int maas=saatucreti=saatucreti*8*30;
        return maas;

    }
}
