package day07;

import java.util.Locale;
import java.util.Scanner;

public class Day07Switch01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any month name...");
        String month = input.next();

        //Ask user to enter the month name then print the month number
        if (month.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (month.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Please enter a valid month name");
        }
            switch(month.toLowerCase()){
        case "January":
            System.out.println(1);
            break;
        case "February":
            System.out.println(2);
            break;
        case "March":
            System.out.println(3);
            break;
        case "April":
            System.out.println(4);
            break;
        case "May":
            System.out.println(5);
            break;
        case "June":
            System.out.println(6);
            break;
        case "July":
            System.out.println(7);
            break;
        case "August":
            System.out.println(8);
            break;
        case "September":
            System.out.println(9);
            break;
        case "October":
            System.out.println(10);
            break;
        case "November":
            System.out.println(11);
            break;
        case "December":
            System.out.println(12);
            break;
            default:
            System.out.println("Please enter a valid month name");
        }
        }}
