package genel;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TestSlayt02 {
    int a = 10;
    public static void main(String[] args) {
//        Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
//the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter integer");
//        int n = scan.nextInt();
//
//        if(n%2==0) {
//            System.out.println("is even");
//        }else {
//            if (n % 2 != 0)
//                System.out.println("is odd");


//        Scanner scan = new Scanner(System.in);
//       System.out.println("Enter integer");
//        int n = scan.nextInt();
//
//
//        String result = n%2==0 ? "Number is even" : "number is odd";
//        System.out.println(result);


        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.


//        Scanner scan = new Scanner(System.in);
//      System.out.println("Enter integer");
//        int year = scan.nextInt();
//
//        if((year%100==0 && year%400==0) || (year%100!=0 && year%4==0)){
//            System.out.println("Leap");
//        }else{
//            System.out.println("Not leap");
//        }

//
//        int dayOfWeek = 5;
//        switch(dayOfWeek) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("enter valid day");
//        }


//        If the user pressed 1, 2, 3 the program will print the number that is pressed;
//        Scanner scan = new Scanner(System.in);
//     System.out.println("Press  number");
//      int number = scan.nextInt();
//
//      switch (number){
//          case 1 :
//              System.out.println("You pressed number 1");
//              break;
//          case 2 :
//              System.out.println("You pressed number 2");
//              break;
//          case 3 :
//              System.out.println("You pressed number 3");
//              break;
//          default:
//              System.out.println("enter valid number");


        //Type java code by using switch statement.
        //A school has following rules for grading system:
        //1. For 50 - C 2. For 80 - B. 4. For 100 - A
        //Ask user to enter marks and print the corresponding grade.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Press  number");
//        int mark = scan.nextInt();
//
//        switch(mark){
//            if(mark==50 &&) {
//                case 1 :
//            }
//                System.out.println();
//            break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + mark);
//        }

//String name = "Burhan";
//String lastName= "Aslan";
//
//        System.out.println(name.concat(" " + lastName));
//
//        String str= "Burhan Aslan";
//        System.out.println(str.charAt(7));
//        System.out.println(""+str.charAt(9) + str.charAt(2));
//        System.out.println(str.toLowerCase().charAt(5));
//        System.out.println(str.charAt(4));

//            String str = "Java is easy to learn";

//        System.out.println(str.length());
//        System.out.println(str.length()-1);
//        System.out.println(str.indexOf("easy"));
//        System.out.println(str.indexOf("l"));
//        System.out.println(str.indexOf('a', 8));

//
//        Scanner scan = new Scanner(System.in);
//       System.out.println("Please enter your e-mail");
//       String str = scan.next();
//
//          String str1 = "burhan.alsan@gmailcom";
//          String expected= "@gmail.com";
//
//
//          if (str.contains(expected)) {
//              System.out.println("E-mail submitted");


//        String str = "Java is easy to learn, if you study hard";
//
//        System.out.println(str.endsWith("d"));
//        System.out.println(str.endsWith("hard"));
//        System.out.println(str.endsWith("k"));


//        String str = "Java is easy to learn, if you study hard";
//
//        System.out.println(str.startsWith("d"));
//        System.out.println(str.startsWith("java"));
//        System.out.println(str.startsWith("s", 6));
//        System.out.println(str.startsWith("Java", 0));

//String str = "Java is easy to learn";
//        System.out.println(str.replace("a","i" ));
//
//        System.out.println(str.replace("Java","Gurmo" ));

//        Scanner scan = new Scanner(System.in);
//      System.out.println("enter your name");
//        String name = scan.nextLine();
//
//        System.out.println(name.replaceAll("\\S", "*"));


//        String str = "Java is easy to learn";
//
//        System.out.println(str.substring(5));
//        System.out.println(str.replace("Java", "Selenium"));
//        System.out.println(str.substring(5,6));
//        System.out.println(str.substring(str.length()-1));

//
//        String str = "Java is easy to learn";
//        System.out.println(str.length());
//        System.out.println(str.trim());
//        System.out.println(str.trim().length());


//            String str = "13.99";
//            String btr = "15.19";
//
//            str=str.replaceAll("\\D", "");
//            btr=btr.replaceAll("\\D", "");
//
//            double  strNumber=Double.valueOf(str);
//            double btrNumber=Double.valueOf(btr);
//            double result=(strNumber+ btrNumber)/100;
//        System.out.println(": $" + result);

//        String name= "Burhan";
//        String lastName="Aslan";
//        String kKKNo="1234567890123456";
//
//
//        String newName= name.substring(0,1).toUpperCase()+
//                        name.substring(1).replaceAll("\\S", "*");
//
//        String newLastName=lastName.substring(0,1).toUpperCase()+
//                        lastName.substring(1).replaceAll("\\S", "*");
//
//        String newKKNo="**** **** **** " + kKKNo.substring(12);
//
//        System.out.println("Name-LastName : "+newName+" "+newLastName+
//
//                "\nkKKNo : " + newKKNo);


        //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers


        String s = "";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 10 && i % 6 == 0) {
                s = s + i + " ";

            }
        }
            System.out.println(s);


        String b ="";
        Integer v=120;

           while (v>10){
               if (v%4==0 &&v%6==0){
                   b=b+v+" ";
               }
               v--;
           }
        System.out.println(v);

        }
    }




