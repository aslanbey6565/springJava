package practices01;

import java.util.Scanner;

public class Q04 {

    ////Type a code that calculates the hypotenuse.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the lenght of the first leg of the right triangle");
        double a = scan.nextDouble();
        System.out.println("Please enter the lenght of the second leg of the right triangle");
        double b= scan.nextDouble();

        double hypotenus = Math.sqrt(a*a +b*b);
        System.out.println(hypotenus);

        


    }
}
