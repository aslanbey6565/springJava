package day02;

public class Day02MethodCreation {

    public static void main(String[] args) {


        System.out.println(addIntegers( 2, 12));
        System.out.println(multiplyIntegers());
        System.out.println(subtractIntegers());
        System.out.println(divideIntigers(24, 5));
        System.out.println(divideIntigers(24.6, 2));
    }
    public static int addIntegers(int a, int b) {
        return a + b;

    }
    public static int multiplyIntegers() {
        return 3 * 5;
    }

    public static int subtractIntegers() {
        return 3 - 5;
    }
    public static double divideIntigers(double a, int b) {
        return a / b;

    //NOTE 1: If you use same data types for all values in a mathematical operation,
        //    result will be in the same data type

    //NOTE 2: If you use different data types in a math operation,
        // the result will be in the largest data type. Exmp; double / ==> double

        /*
        What we learn so far?
        1. How to create dynamic methods
        2. How to use a method in main method
        3. How to print the result of the method on the console
        4. How to decide return type when you create  a method
        5. How to learn data types in mathematical operation

         */
    }}

