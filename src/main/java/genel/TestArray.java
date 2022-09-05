package genel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArray {

    public static void main(String[] args) {
//
//        //Find the closest 2 integers in the given list.
//        // [12, 15, 10, 11, 20] ==> 12-11, 10-11
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(15);
//        list.add(10);
//        list.add(11);
//        list.add(20);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//
//        int minDiff = list.get(1) - list.get(0);
//
//
//        System.out.println(minDiff);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) - list.get(i - 1) == minDiff) {
//                System.out.println(list.get(i) + "-" + list.get(i - 1));
//            }
//        }
//        From a given list find all pairs whose sum is a given number
//        {4, 6, 5, -10, 8, 5, 20} ==> 10

//        List<Integer> list=  Arrays.asList(4, 6, 5, -10, 8, 5, 20);
//
//        for (int i=0; i< list.size(); i++){
//            for (int k=i+1; k< list.size(); k++){
//                if(list.get(i) +list.get(k)==10){
//                System.out.println(list.get(i) + " - " + list.get(k));
//            }
//
//        Count the words in a String one by one
//        String is "Ali came to school, and Ayse came to school."
//        Ali=1, came=2, to=2, school=2, and=1, Ayse=1


//        String str = "Ali came to school, and Ayse came to school.";
//
//        String strWithoutPunct = str.replaceAll("\\p{Punct}","");
//        System.out.println(strWithoutPunct);
//
//        String worrd [] = strWithoutPunct.split(" ");
//        System.out.println(Arrays.toString(worrd));

//        int number[] = {1, 5, 6, 4, 8, 9, 5, 45, 60};
//
//        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));
//        System.out.println(Arrays.binarySearch(number, 5));

//
//        String[] letters = {"A", "B", "C", "D", "E"};
//        Arrays.sort(letters);
//        System.out.println(Arrays.toString(letters));
//        System.out.println(Arrays.binarySearch(letters, "C"));


//            int arr1[]={1,2,5,};
//            int arr2[]={2,5,1};
//
//        System.out.println(Arrays.equals(arr1, arr2));//false
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.equals(arr1, arr2));//true


        // String to Array
//
//        String str="JAVA KOLAY olacak";
//
//        String words[]=str.split(" ");
//        System.out.println(Arrays.toString(words));//[JAVA, KOLAY, olacak]
//        System.out.println(words[0]);//JAVA
//
//        String word[]=str.split("KOLAY");
//        System.out.println(Arrays.toString(word));//[JAVA ,  olacak]
//
//        String wor[]=str.split("");
//        System.out.println(Arrays.toString(wor));//[J, A, V, A,  , K, O, L, A, Y,  , o, l, a, c, a, k]

        //HOW MANY TIMES USED IN A STRING

        String str = "Bugun Java cok kolay olacak";
        String newStr[] = str.split("");
        String letter = "a";
        System.out.println(Arrays.toString(newStr));

        int counter = 0;
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].equals(letter)) {
                counter++;
            }
        }
        System.out.println("Lertter " + letter + " in the string " + counter + " times used");
    }
}




