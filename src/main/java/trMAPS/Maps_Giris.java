package trMAPS;

import day26.HashMap01;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class Maps_Giris {

    /*
        HashMap syncronized degildir. Thread-safe degildir
        HashTable synchorinizeddir. Thread safedir. Threadler tarafindan ortak kullanilabilir
        ThreeMap syncronized degildir. Thread safe degildir+

        Maps key - value pairs kullanir

     */

    public static void main(String[] args) {

        HashMap<Integer, String> obje1 = new HashMap<>();
        obje1.put(101, "Ali , Can, Java");
        obje1.put(102, "Veli , Yan, Java");
        obje1.put(103, "Ali , Can, C#");
        System.out.println(obje1);
    }
}
