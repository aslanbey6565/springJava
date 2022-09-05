package trArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ders26ForEachLoop {


    public static void main(String[] args) {

//        int arr[] = {1, 4, 9, 7, 8};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//        System.out.print("");
//
//        // For Each Loop;
//        // Calistirmak icin hedef bir collection vermeliyiz
//
//        for (int each : arr) {
//            System.out.print(each + " ");
//        }

//
//        int brr[] = {2,5,4,6,4,9,7,1,3,10};
//
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int each : brr) {
//            numbers.add(each);
//        }
//        System.out.println(numbers);
//
//        for (int each : numbers ) {
//            if(each%3 !=0){
//            System.out.print(each + " ");
//
//        }


//    }}

//ortak elamanlar

        String array1 [] = {"Ali", "Can","Ayse"};
        String array2 [] = {"Ali", "Kan","Ayse"};

        List<String> sameElements = new ArrayList<>();

        for (String each1: array1 ) {
            for (String each2: array2 ) {
                if(each1.equals(each2)){
                    sameElements.add(each1);
                }

            }
        }
        if (sameElements.isEmpty()) {
            System.out.println("No same element");
        }else{
            System.out.println(" same element " + sameElements);
        }
    }
}







