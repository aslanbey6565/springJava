package genel;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        //  Scanner input = new Scanner(System.in);
        //  System.out.println("Enter your exam result");
        //  double exam = input.nextDouble();
        //  if (exam > 74.60) {
        //     System.out.println("You pass");
        //  } else {
        //      System.out.println("You fail");
        //  }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter day number");
//        int dayNum = input.nextInt();
//
//        if (dayNum==7) {
//            System.out.println("December");
//
//        }else if(dayNum==6){
//        System.out.println("July");
//
//        }else{
//            System.out.println("gurmo");

//        String name = "Aslanbey";
//        int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
//        System.out.println(numOfLetters);
//    }


//        String fullName = "   Burhan aslan   ";
//        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();
//        String initialsOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
//
//        System.out.println(initialOfFirstName + initialsOfLastName);


//
//                 String dayName = "     SunDay   ";
//                String initialOfDayName = dayName.trim().substring(0, 1).toUpperCase();
//                String otherCharsOfDayName = dayName.trim().substring(1).toLowerCase();
//                System.out.println(initialOfDayName + otherCharsOfDayName);
//        String name = "    AsAlanbey    ";
//        String initialOfName = name.trim().substring(0, 1).toUpperCase();
//        String otherCharOfName = name.trim().substring(1).toLowerCase();
//        System.out.println(initialOfName + otherCharOfName);

        // different from space = "\\S"

//        String creditCardNumber = "1234 1234 1234 1234";
//        String invisiblePart = creditCardNumber.substring(0, 15).replaceAll("\\S", "*");
//        String visiblePart = creditCardNumber.substring(15);
//        System.out.println(invisiblePart + visiblePart);

//
//       String s = "Burhan was born in 1989";
////        int numOfChar = s.replace(" ", "").length();
////        System.out.println(numOfChar);
//
//
//        int numOfCharacters = s.replace(" ", "").split("").length;
//        System.out.println(numOfCharacters);



        //Ask user to enter his full name, then create a unique id for the user
        //Id should contain first 2 characters of the first name and last 2 characters of the last name
        //Use the current date time at the end of the Id
        //Example; Tom Hanks ==> Toks20220528110434

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = input.nextLine();
//
//        String firstName = name.substring(0, 2);
//        String lastName = name.substring(name.length()-2);
//        System.out.println(firstName + lastName );
//
//        LocalDateTime currenDataTime = LocalDateTime.now();
//        String w = currenDataTime.toString().substring(0,19).replaceAll("[^0-9]", "");
//        System.out.println(firstName + lastName + w );

    }
}