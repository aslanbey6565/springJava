package day04;

import java.time.LocalDate;
import java.util.Scanner;

public class Day04Scanner {
    /*
        Ask user to enter the width and the length of a rectangle then print the area and perimeter on the console
          Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("Enter the length of the rectangle");
        double length = input.nextDouble();
        System.out.println("Area is " + width * length);
        System.out.println("Perimeter is " + 2 * (width + length));
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter calculate age");
        int dob = scan.nextInt();

        int age = calculateAge(dob);
        System.out.println(age);


    }

    public static int calculateAge(int dateOfBirth) {
    return LocalDate.now().getYear() - dateOfBirth;

    }

}
