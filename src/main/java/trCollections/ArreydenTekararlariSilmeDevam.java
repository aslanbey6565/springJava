package trCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArreydenTekararlariSilmeDevam {

        //verilen bir arrayden tekrar eden elementleri silip unique haline getirme


        public static void main(String[] args) {

            Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

            arr= benzersizYap(arr);
            System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8] = yeni arrayden gelen

        }

        private static Integer[] benzersizYap(Integer[] arr) {
            Set<Integer> benzersizSet=new HashSet<>();
            for (Integer each : arr) {
                benzersizSet.add(each);
            }
            System.out.println(benzersizSet);
            Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
            int index=0;
            for (Integer each : benzersizSet
                 ) {
                arrBenzersiz[index]=each;
                index++;

            }

            return arrBenzersiz;
        }}
