package trMAPS;

import trConstructor.MyConstructor;

import java.util.HashMap;
import java.util.Map;

public class MapMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> myMap=new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K",5);

        //Bir ekleme yapmak istedigimizde Key daha once eklenmediyse mape eklesin
        //Daha once eklendiyse , eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A",6));//null

        if(myMap.putIfAbsent("K",20) !=null){
            System.out.println("Girilen key Map de zaten var");
        }
        System.out.println(myMap);
        myMap.put("A", 10);

        System.out.println(myMap);//{A=10, H=3, K=5}

        myMap.computeIfAbsent("A", v->20);
        System.out.println(myMap);//{A=10, H=3, K=5}

        myMap.compute("A", (k,value) ->20);
        System.out.println(myMap);//{A=20, H=3, K=5} == Lambda expression

        // H nin degerini 2 katinin 5 fazlasi yapalim

        myMap.compute("H", (k, value) ->(2*value+5));

        System.out.println(myMap);//{A=20, H=11, K=5}







    }
}
