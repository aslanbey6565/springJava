package trPassByValue;

public class PassByValue02 {

    /*
        eger bir methodda yapilan degisikligin kalici olmasini istiyorsak iki yontem vardir;
        1) Variablei class levelda static olarak olustururlur


     */
    static  double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();
    }
    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("Indirimli fiyat: "+ etiketFiyati);
    }
}
