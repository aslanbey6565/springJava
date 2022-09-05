package trInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IstenenElemaniSilme {

    public static void main(String[] args) {


        //20 ile 40 arasindakiler


        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);


        ListIterator itr=liste.listIterator();

        while (itr.hasNext()) {
            Object sayi = itr.next();

            if ((Integer) sayi<20 || (Integer) sayi >40) {
                itr.remove();
            }
        }
            System.out.println(liste); //[23, 40]


    }
}
