package trInterFace;

import java.util.ArrayList;
import java.util.List;

public class iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); //[5, 7, 8, 6, 9]

        //For each kullanarak her elementi 2 arttiralim

        for (Integer each : liste){
            each=each+2;
        }
        System.out.println(liste);//[5, 7, 8, 6, 9]



        //Iterator nasil calisir

    }
}
