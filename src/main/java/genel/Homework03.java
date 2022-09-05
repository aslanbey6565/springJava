package genel;

import java.util.Locale;
import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {
//        a) "Winter" for December, January, February
//        b) "Spring" for March, April, May
//        c) "Summer" for June, July, August
//        d) "Fall" for September, October, November
//        e) "Invalid month name" for all the others


//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the month number");
//        String mName = input.next();
//        mName = mName.toLowerCase();
//
//        if(mName.equals("December") || mName.equals("january") || mName.equals("february")){
//            System.out.println("Winter");
//

        int i = 1;

        int  j = 0;

        switch (i) {

            case 2 :

                j += 6;

            case 4 :

                j += 1;

            case 1 :

                j += 4;

            default :

                j += 2;



        System.out.println("j = " + j);
        }
    }
}
