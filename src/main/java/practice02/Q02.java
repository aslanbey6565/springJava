package practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

         /*
		 Ask user to enter two words. If the number of characters of the first word is even, then put the second word into the middle of the first word.
		 If the number of characters of second word is odd, then print on console "You can not put second word into the middle of the first word. Because it's number of character is odd.".
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1. words");
        String str= scan.nextLine();
        System.out.println("Enter 2. words");
        String str2= scan.nextLine();

        if (str.length()%2==0){
            System.out.println();
        }




    }
}
