package practices01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
         /*
       Type java code by using ternary. Ask user to enter two integers
       Write a program to print the maximum  one on the console.(Do not forget they may be equal)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter  first integer");
        int firstint = scan.nextInt();

        System.out.println("Please enter  second integer");
        int secondtint = scan.nextInt();

        System.out.println(firstint>secondtint ? firstint:secondtint);


    }
}
