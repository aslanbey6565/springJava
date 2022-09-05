package trPassByValue;

import jdk.swing.interop.SwingInterOpUtils;

public class PassByValue03 {
    //Kalici indirim icin 2. yontem

    public static void main(String[] args) {

        double etiketFiyat = 100;
        double indirimYuzdesi = 10;

        etiketFiyat = kaliciIndirimYap(etiketFiyat, indirimYuzdesi);
        System.out.println("Main method da indirim sonrasi etiket fiyat: " + etiketFiyat);
    }

    public static double kaliciIndirimYap(double etiketFiyati, double indirimYuzdesi) {
        etiketFiyati = etiketFiyati * (100 - indirimYuzdesi) / 100;
        System.out.println("Indirimli fiyat: " + etiketFiyati);
        return etiketFiyati;

    }
}