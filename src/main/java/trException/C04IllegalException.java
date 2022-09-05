package trException;

import java.util.Scanner;

public class C04IllegalException {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi girtiniz");
        int yas= scan.nextInt();


        if (yas<=0 || yas>120){
            //System.out.println("Lutfen gecerlin yas giriniz");
            throw  new IllegalArgumentException();
        }else{
            System.out.println("Uygun yas giriniz...");
        }
    }
}
