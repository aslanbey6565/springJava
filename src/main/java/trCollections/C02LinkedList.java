package trCollections;

import java.util.Deque;
import java.util.LinkedList;

public class C02LinkedList {
    public static void main(String[] args) {

        Deque<Integer> liste=new LinkedList<>();
        liste.addFirst(10);
        liste.addLast(20);
        System.out.println(liste);//[10, 20]
        System.out.println(liste.element());// ilk elementi silmeden bize getirir //10

        System.out.println(liste.getLast());//20
        System.out.println(liste.getFirst());//10

        liste.offer(30);//sona ekler ama bisey dondurmez
        System.out.println(liste);//[10, 20, 30]
        liste.offerFirst(15);
        System.out.println(liste);//[15, 10, 20, 30]
        liste.offerLast(40);//sona ekler ve true dondurur
        System.out.println(liste);//[10, 20, 30, 40]


        System.out.println(liste.peek());//ilk elementi silmeden dondururu. bulamazsa null getririr
        System.out.println(liste.poll()); //bos iken kullanirsak null donurur
        System.out.println(liste.pollFirst());
        System.out.println(liste.pollLast());

        liste.push(30);//listenin basina element ekler
        liste.push(11);
        System.out.println(liste); //[11, 30, 20, 30]


    }
}
