package genel;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {
        // Take a number from user; if it is less than 0 print "negative"

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int i = input.nextInt();
//
//        if(i<0){
//            System.out.println(("Negative"));
//
//        }else{
//            System.out.println("pozitif");
//        }
//
//        int x = 12345;
//        int ones = x%10;
//        int tens = (x/10)%10;
//        int hunderends = (x/100)%10;
//        int thousends = (x/1000)%10;
//        int tenthousends = x/10000;
//
//        System.out.print(tens +"n" +ones +"n" + hunderends +"n" + thousends +"n" + tenthousends);


    //type a code that calculate hypotenus

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter first integer");
//        int x = input.nextInt();
//        String result = x>5 ? "Positive" : "Negative";
//
//        System.out.println(result);
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please a character");
//        char c = input.next().charAt(0);
//
//        System.out.println(c>='A' && c<='Z'|| c>='a' && c<='z' ? "lower letter" : "Not letter");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter first name, middle name and last name");
//        String str  = input.nextLine().trim().toUpperCase();
//        char initialOfMiddle = str.charAt(str.indexOf(" ")+1);
//        System.out.print(initialOfMiddle);
//        char initialOfLastName=str.charAt(str.lastIndexOf("")+1);
//        System.out.print(initialOfLastName);
//        System.out.println("initial of first name:"+str.charAt(0));

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter first word");
//        String word1 = input.next();
//        System.out.println(word1);
//
//        System.out.println("enter second word");
//        String word2 = input.next();
//
//        if(word1.length()%2==0){
//            String str1 = word1.substring(0, word1.length()/2);
//            System.out.println("Str1: "+str1);
//            String str2=word2.substring(word1.length()/2);
//            System.out.println("str2: "+str2);
////            System.out.println(str1+word2+str2);

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter year of service");
//        int year = Math.abs(input.nextInt());
//        System.out.println("Enter your salary");
//        int salary= Math.abs(input.nextInt());
//
//        if(year>=15){
//            int bonus=salary*5/100;
//            System.out.println("Your bonus: "+bonus);
//        }else{
//            System.out.println("You should work "+(25 -year)+ "year(s) more.");
//        }

//        for(int i = 0; i<256; i++ ){
//            System.out.println(i);
//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of process: "+"\n"+"\n"+"Process 1: Balance inquiry"+"\n"+"Process 2: Money withdrawal"+"\n"+"Process 3: Deposit money"+"\n"+"End the process");
//        int process =input.nextInt();
//        int balance = 4000;

//        switch(process){
//            case 1:
//                System.out.println("Your balance: "+balance);
//                break;
//            case 2:
//                System.out.println("Enter money you want to withdraw");
//                int withdraw= input.nextInt();
//                if(withdraw<=balance) {
//                    balance-= withdraw;
//                    System.out.println("Your current balance after the withdrawal of " + withdraw + ":" + balance);
//                }else {
//                    System.out.println("Your balance is not enough");
//                }
//                break;
//            case 3:
//                System.out.println("Enter the mamount of money you want to deposit");
//                int deposit= input.nextInt();
//
//                if(deposit>2500){
//                    System.out.println("Your daily limit: 2500");
//                }else{
//                    balance+=deposit;
//                }
//                System.out.println("Your curent balance after the deposit of $"+deposit+": "+balance);
//                break;
//
//        }

         /*
		 Ask user to enter a character and check if it is a letter.
		 If it is not a letter print "Not Letter" on console.
		 If it is letter check if it is lowercase or uppercase letter.
		 If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
		 */
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter a character");
//            char c = scan.next().charAt(0);
//
//            System.out.println(((c <= 'z' && c >= 'a') || (c >= 'A' && c <= 'Z')) ? ((c >= 'A' && c <= 'Z') ? "Uppercase Letter" : "Lowercase Letter"): "NOT Letter");

        }
    }

