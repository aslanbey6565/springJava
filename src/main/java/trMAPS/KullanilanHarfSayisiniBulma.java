package trMAPS;

import java.util.HashMap;
import java.util.Map;

public class KullanilanHarfSayisiniBulma {

    /*
     Verilen bir stringteki harfleri ve harflerin kacar kez kullanildigini return eden bir method yazin
     Ornek: Input : Helloop   Output : h=1, e=1, l=2, 0=3
     */
    public static void main(String[] args) {


        String input="Hellooo";
        String harflerArr[]=input.split("");

        Map<String,Integer> kullanimSayilari = new HashMap<>();

        //for ile
//        for (int i = 0; i < harflerArr.length; i++) {
//            if(kullanimSayilari.containsKey(harflerArr[i]));
//            kullanimSayilari.put(harflerArr[i], kullanimSayilari.get(harflerArr[i]+1));


        //for each ile

        for (String each: harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each, kullanimSayilari.get(each)+1);

        }else{
                kullanimSayilari.put(each,1);
            }

        }
        System.out.println(kullanimSayilari);//{e=1, H=1, l=2, o=3}

    }

}
