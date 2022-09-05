package trException;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kontrol = 0;
        while (kontrol !=2){

            System.out.println("Bolmek istediginiz sayiyi yazin");
            int sayi1 = scan.nextInt();

            System.out.println("Kaca Bolmek istediginizi yazin");
            int sayi2 = scan.nextInt();

            try {
                System.out.println("sonuc: " +sayi1/sayi2);
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("problem sayilarda brooo");
            }

            System.out.println("devam etmek icin 1 \nbitrmek icin 2 ye basin");
            kontrol= scan.nextInt();
    }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at trException.Exceptions.main(Exceptions.java:16)
        //Bu sorunu cozmek icin If kullaniriz ama her sorunda yapilamaz
//        if (sayi2 == 0){
//            System.out.println("sayi 0 tanimsizdir");
//
//        }else{
//            System.out.println("sonuc : " + sayi1/sayi2);
//        }
}}
