package trMAPS;

import java.util.Map;
import java.util.Set;

public class Update02 {

    //Verilen mapteki tum branslari Java yapalim
    //verilen mapteki numarasi 102 olan kaydin bransini Java yapalim
    /*
    Mapte value kompleks olabildigi icin
    value icerisinden bir bolumu degistirmek istersek
    once valueya ulasmak sonra onu manipule ederek
    istedigimiz degisikligi yapmak
    ve en son degismis halini yeniden Mape eklemek gerekir
     */

    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {

            Integer keyEntry = each.getKey();
            if (keyEntry == 102) {
                String valueEntry = each.getValue();
                String valueArr[] = valueEntry.split(", ");
                valueArr[2] = "Java";

                String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", " + valueArr[3];

                sinifListMap.put(keyEntry, valueYeni);
            }

            }
            System.out.println(sinifListMap);
        }}