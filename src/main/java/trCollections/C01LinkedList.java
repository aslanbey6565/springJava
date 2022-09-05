package trCollections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01LinkedList {
    public static void main(String[] args) {
        /*
            LinkedListin 2 parent Iterfacesi vardir
            LikedList olusturrken data turu olarak;
            LikedList secersek; iki parenttaki tum methodlar
            List secersek ; sadece list Interfacedeki methodlar
            Deque/queue secersek; Dequedeki methodlari kullanabiliriz

         */

        LinkedList<Integer> yenilist = new LinkedList<>();

        yenilist.add(10);// LinkedList

        //Sadece List Interfaceden ozellikler kullanmak sitersek;
        List<Integer> yenilist2 = new LinkedList<>();
        yenilist2.add(10);
        yenilist2.remove(0);

        //Sadece Deque den  ozellikler kullanmak sitersek;
        Deque<Integer> yenilist3 = new LinkedList<>();
        yenilist3.addLast(20);
        yenilist3.addFirst(15);
        System.out.println(yenilist3);//[15, 20]

    }
}
