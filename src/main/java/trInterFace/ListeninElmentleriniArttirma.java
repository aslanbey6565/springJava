package trInterFace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListeninElmentleriniArttirma {

    public static void main(String[] args) {

        //verilen listedeki her elementi 2 artirin
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        //Listenin tum elementlerini getirmesi icin iteratorun has next ve next methodlari beraber kullanilir

        ListIterator itr=liste.listIterator();

        while (itr.hasNext()){ // yaninda element oldugu muddetce calsir

    Object  sayi = itr.next();
    itr.set((Integer)sayi+3);

        }
        System.out.println(liste);

    }
}
