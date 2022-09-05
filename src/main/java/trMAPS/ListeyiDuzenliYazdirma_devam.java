package trMAPS;

import java.util.*;

public class ListeyiDuzenliYazdirma_devam {
    public static void main(String[] args) {

        //Sinif listesini duzenli yazdirma
        Map<Integer, String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*
            Eger keylere tek tek ulasmak istersek Index yapisina ihtiyac var.
            Amcak map index yapisini desteklemez
            Bunun icin keyleri once sete sonra da setin tum elementlerini liste ekledik
         */
        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList=new ArrayList<>();
        keyList.addAll(sinifKeySeti);

        //Valueleri index ile ulasaca[im bir yapiya koyalim

        Collection<String> sinifValueColl=sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String> sinifvaluelist= new ArrayList<>();
        sinifvaluelist.addAll(sinifValueColl);

        System.out.println(sinifvaluelist);//[Ali , Can, Java, Veli , Yan, Java, Ali , Can, C#]

        //her bir value birden fazla bilgi icerir
        //bunun icin valueleri multidimensional bir arraya atmak mantikli ancak MDA olusturmak icin boyutlari bilmek gerekiyor

        int outerArrayBoyut = sinifvaluelist.size();
        System.out.println(outerArrayBoyut);//3

        //inner arraylerin boyutunu bumak

        String ilkvalue =sinifvaluelist.get(0);
        System.out.println(ilkvalue);//Ali , Can, Java
        String ilkvaluearray[]= ilkvalue.split(", ");
        int innerArrayBoyut=ilkvaluearray.length;

        String valueMDAArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp [] =sinifvaluelist.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDAArr[i][j]=temp[j];
            }
        }
        //bu satira kadar keylere index ile ulastik ve keyliste atadik
        //Valueleri valueMDArr e atadik
        //simdi bu key ve valuelere istedigim gibi manipule edebilirim

        System.out.println("Numara  Isim  Soyisim  Brans  Oylesine");
        System.out.println("======================================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "    ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDAArr[i][j] + "    ");


            }
            System.out.println("");
        }


    }
}
