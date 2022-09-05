package trException;

public class Exceptions2 {
    public static void main(String[] args) {
    String str="12345a";



        //.NumberFormatException

        try {int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin iki kati" + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");
        }

    }}
