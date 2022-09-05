package day14;

import  java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop02 {

    public static void main(String[] args) {

        //Sort the array elements according to their lengths.
        // "Ali" - "Veli" - "Maria" - "Michael"

             String arr [] = {"Michael", "Ali", "Maria", "Veli"};
             System.out.println(Arrays.toString(arr)); //[Ali, Veli, Maria, Michael]

             Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));


        //Sort the array elements according to their lengths in descending order
        // "Michael", "Maria", "Veli" "Ali"

            String drr[] = {"Jackson", "Tom", "Dustin", "Marry"};
              System.out.println(Arrays.toString(drr));

            Arrays.sort(drr, Comparator.comparingInt(String::length).reversed());
             System.out.println(Arrays.toString(drr)); //[Jackson, Dustin, Marry, Tom]


        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order
        //["Jack", "Mark", "Adam", "Jackson", "Marry", "Junior" "Thomson"]

        String brr[] = {"Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"};
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));

    }



}
