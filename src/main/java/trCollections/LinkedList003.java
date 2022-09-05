package trCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList003 {
    public static void main(String[] args) {

        LinkedList<String> yeni = new LinkedList<>();
        yeni.add("Eli");
        yeni.add("Oli");
        yeni.add("Calgary");
        yeni.add("Canada");


        Scanner scan =new  Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim= scan.nextLine();

        System.out.println(yeni);

        if (yeni.remove(isim)){
            System.out.println("bu isim vardi ve silindi");
            System.out.println(yeni);
        }else{
            System.out.println("bu isim yoktu bu yuzden silinemedi");
        }
        scan.close();

    }
}
