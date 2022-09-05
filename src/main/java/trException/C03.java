package trException;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int toplam=0;

    do {
        System.out.println("Lutfen toplamak isteginiz sayiyi giriniz \n bitirek icin Q YA BASINIZ");
        int sayi=0;

        try {
            sayi= scan.nextInt();

        } catch (InputMismatchException e) {
            String hataligiris=scan.next();
            if (hataligiris.equalsIgnoreCase("q")){

                break;
            }else{
                System.out.println("hatali giris");
            }
        }

    }while ( toplam<500);
        System.out.println("girilen sayilarin toplami " +toplam);
}}
