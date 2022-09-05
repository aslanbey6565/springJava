package trPassByValue;

import javax.management.MBeanAttributeInfo;

public class PassByValue {
    public static void main(String[] args) {

        /*
         Java PASS BY VALUE bir programlama dilidir
         bir primitive variablei argument olarak bir methoda yollarsaniz
         java o varabli degil, degerini(value) aktarir(pass)
         */
        double etiketFiyati=100;
        yuzdeOnindirimYap(etiketFiyati);
        yuzdeOnindirimYap(etiketFiyati);
        yuzdeOnindirimYap(etiketFiyati);
        yuzdeOnindirimYap(etiketFiyati);
    }

    public static void yuzdeOnindirimYap(double etiketFiyati) {
        etiketFiyati=etiketFiyati*0.90;
        System.out.println("Sizin icin %10 indirimli fiyat :" +etiketFiyati);

    }
}
