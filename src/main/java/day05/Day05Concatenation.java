package day05;

import jdk.swing.interop.SwingInterOpUtils;

public class Day05Concatenation {

    /*
       Concatenation: Joining Strings with each other or with other data types
                      To do concatenation we have 2 options;
                      1)Use '+' sign
                      2)Use 'concat()' method
    */

    public static void main(String[] args) {


        String s = "Tom";
        String t = "Hanks";
        int i = 12;
        int k= 5;
        char c = 'A';
        System.out.println(s +" "+ t);
        System.out.println(s.concat(" ").concat(t));
        System.out.println(s + i + k);
        System.out.println( i + k+ s);
        System.out.println( i + s + k);
        System.out.println(s + k*i);
        System.out.println(i + c + s);
        System.out.println(c + s + k);
    }

}
