package trEntrySet;

import trMAPS.MapOlustur;

import java.util.Map;
import java.util.Set;

public class EntrySet01 {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer, String>> sinifEnterySeti = sinifListMap.entrySet();
        System.out.println("No  Isim  Soyisim     Brans  D.Yili");
        System.out.println("====================================");
        for (Map.Entry<Integer, String> each : sinifEnterySeti) {

           Integer enteryKey=each.getKey();
           String valueStr=each.getValue();

           String valueArr[]=valueStr.split(", ");

            System.out.printf("%-4d %-6s %-9s %-6s %s\n", enteryKey, valueArr[0], valueArr[1] ,valueArr[2] , valueArr[3]);

        }
        System.out.println("====================================");
    }}
