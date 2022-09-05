package trMAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01Maps {
    public static void main(String[] args) {

        // Javada collection uyesi bir yapida data turu Object secilirse
        // her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting
        // sorunlariyla karsilasabiliriz
        List<Object> list = new ArrayList<>();
        list.add("Burhan");
        list.add(15);
        list.add(10.2);


        System.out.println(list); //[Burhan, 15, 10.2]
        list.set(1,(Integer)(list.get(1)) + 10);

        Map<Integer, String> siniflist =new HashMap<>();


        siniflist.put(101, "Ali , Can, Java");
        siniflist.put(102, "Veli , Yan, Java");
        siniflist.put(103, "Ali , Can, C#");
        System.out.println(siniflist);//{101=Ali , Can, Java, 102=Veli , Yan, Java, 103=Ali , Can, C#}
        System.out.println(siniflist.keySet());//[101, 102, 103]
        System.out.println(siniflist.values());//[Ali , Can, Java, Veli , Yan, Java, Ali , Can, C#]






    }
}
