package day07;

import java.util.Scanner;

public class Day07Switch03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c = input.next().toLowerCase().charAt(0);
        System.out.println(c);


        switch (c){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
                System.out.println("Not Vowel");
            default:
                System.out.println("Enter a letter not the others");


    }}


}
