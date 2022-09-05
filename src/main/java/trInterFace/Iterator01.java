package trInterFace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); //[5, 7, 8, 6, 9]

        //Iterator nasil calisir
            //itr.hasNext() ==> true
            //itr.next()


        Iterator itr= liste.iterator();
        System.out.println(itr.hasNext()); //True
        System.out.println(itr.next()); //5
        System.out.println(itr.next()); //7
        itr.remove();
        System.out.println(liste); //[5, 8, 6, 9]

    }}
