package trMAPS;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ListelenenElementleriListele {
    /*
       Verilen mapte istenen programlama dilini bilen kisileri list olarak donduren bir method yazin

        map {101=Ali, can,java, 102= veli, yan,java, 103=ali,yan,c#}
        istenen dil => java
        Sonuc[Ali,Veli]
     */

    public static void main(String[] args) {

        Map<Integer, String> sinifMap = MapOlustur.myMap();
        String istenenDil = "Dev";
        List<String> istenenDiliBilenlerListesi = istnenDiliBilenListesiOlustur(sinifMap, istenenDil);
        System.out.println(istenenDiliBilenlerListesi);
    }

    public static List<String> istnenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {

        List<String> istenenDiliBilenlerListesi = new ArrayList<>();
        Collection<String> sinifValueColl = sinifMap.values();
        List<String> sinifValuelist = new ArrayList<>();
        sinifValuelist.addAll(sinifValueColl);
        int outerArrayBoyut = sinifValuelist.size();
        String ilkValue = sinifValuelist.get(0);

        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;
        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValuelist.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j] = temp[j];
            }
        }
        for (int i = 0; i < outerArrayBoyut; i++) {
            if (valueMDArr[i][2].equals(istenenDil)) {
                istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
            }

        }
        return istenenDiliBilenlerListesi;
    }
}


