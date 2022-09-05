package trMAPS;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class ListeyiDuzenliYazdirma {
    public static void main(String[] args) {

        //Sinif listesini duzenli yazdirma
       Map<Integer, String> sinif= MapOlustur.myMap();
        System.out.println(sinif);

        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara isim Soyisim Brans");
        System.out.println("=========================");

        //Map yapisini kodlarla manipule edip
        // mapdeki datalari istedigimiz formata sokmamiz gerekir
        //1. adim key ve valueleri mapdan alip iki farkli collection uyesine atadik
        Set<Integer> keyset= sinif.keySet();
        Collection<String> valueSet=sinif.values();
        System.out.println(keyset);//[101, 102, 103]
        System.out.println(valueSet);//[Ali , Can, Java, Veli , Yan, Java, Ali , Can, C#]
        System.out.println(valueSet.size());

        for (String each : valueSet
             ) {
            System.out.println(each);
        }

    }
}
