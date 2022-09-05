package practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {



//    public static void main(String[] args) {
//
//        int n1=1;
//        int n2=1;
//        int n3=0;
//
//        System.out.print(n1 + " " +n2+" ");
//        for (int i = 1; i <9; i++) {
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//
//            System.out.print(n3+ " ");
//
//        }

        //Ask user to enter first name, middle name and last name as one single String, then print the first character of middle name and last name.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name, middle name and last name");
        String str= scan.nextLine().trim().toUpperCase(Locale.ROOT);

        char initialOfMiddle= str.charAt(str.indexOf(" ")+1);
        System.out.print(initialOfMiddle);

        char initialOfLastName= str.charAt(str.lastIndexOf(" ")+1);
        System.out.print(initialOfLastName);
    }}
