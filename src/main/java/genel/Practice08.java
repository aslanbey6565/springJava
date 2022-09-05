package genel;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer");

    }

    public static void method(int a, int... numbers) {
        int sum=0;

        for (int w: numbers) {
            sum+=w;


        }

        int result= a*sum;
        System.out.println(sum);
    }
}
