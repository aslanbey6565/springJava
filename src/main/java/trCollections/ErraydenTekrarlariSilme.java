package trCollections;

import java.util.HashSet;
import java.util.Set;

public class ErraydenTekrarlariSilme {


    //verilen bir arrayden tekrar eden elementleri silip unique haline getirme


    public static void main(String[] args) {

        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arr= benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> benzersizSet=new HashSet<>();
        for (Integer each : arr) {
            benzersizSet.add(each);
        }
                    System.out.println(benzersizSet);

            return arr;
        }}
