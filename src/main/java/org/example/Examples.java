package org.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Examples {

    public static void main(String[] args) {

//        String s = "abaa";
//
//        //remove opunctutation marks and spaces digits and symbol
//        s=s.replaceAll("[^a-zA-Z]", "");
//        System.out.println(s);//Tomarephantoms
//
//        //get character one by one
//        String [] letters = s.split("");
//        System.out.println(Arrays.toString(letters));//[T, o, m, a, r, e, p, h, a, n, t, o, m, s]
//
//
//        //count the occurens
//        Map<String, Integer> result =new HashMap<>();
//
//        for (String w : letters
//             ) {
//            Integer numOfCharacters =result.get(w);
//            if(numOfCharacters ==null){
//                result.put(w, 1);
//            }else{
//                result.put(w, numOfCharacters+1);
//
//            }
//          }
//        System.out.println(result);

        String str = "Burhan Aslan QA Engineer";

        //remove opunctutation marks and spaces digits and symbol
        str= str.replaceAll("[^a-zA-Z]","");
        System.out.println(str); //BurhanAslanQAEngineer

        //get character one by one
        String [] list = str.split("");
        System.out.println(Arrays.toString(list));//[B, u, r, h, a, n, A, s, l, a, n, Q, A, E, n, g, i, n, e, e, r]

        //count the occurens

        Map<String, Integer> result = new HashMap<>();

        for (String w: list
        ) {
            Integer numOfOccurence = result.get(w);

            if (numOfOccurence == null) {
                result.put(w, 1);
            } else {
                result.put(w, numOfOccurence + 1);
            }
        }
        System.out.println(result);
}}
