package practices01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

    	/*
	 Ask user to enter his/her first name, last name, age, height and weight then print them on console in this way:
	 		First Name: ...
	 		Last Name : ...
	 		Age: ...
	 		Height: ...
	 		Weight: ...
	 Note: Use only one "System.out.println();"
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstname = scan.next();

        System.out.println("Please enter your lastname");
        String lastname = scan.next();


        System.out.println("Please enter your age");
        int age = scan.nextInt();

        System.out.println("Please enter your height");
        double height = scan.nextDouble();


        System.out.println("Please enter your weight");
        double weight = scan.nextDouble();

        System.out.println("First Name: "+firstname+"\n"+"Last Name: "+lastname+"\n"+"Age: "+age+"\n"+"Height: "+height+"\n"+"Weight: "+weight);








}}
