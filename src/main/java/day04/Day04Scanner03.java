package day04;

import java.util.Scanner;

public class Day04Scanner03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width, of a rectangularprism");
        double width = input.nextDouble();
        System.out.println("Enter the  length of a rectangularprism");
        double length= input.nextDouble();
        System.out.println("Enter the height of a rectangularprism");
        double height = input.nextDouble();

        System.out.println("volume of prism"+ width*length*height);

    }

}
