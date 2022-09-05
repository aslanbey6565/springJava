package genel;

public class WhileLoopQuestions {


    public static void main(String[] args) {

//             Write a program to print numbers from 1 to 5.
//
//        int i =1;
//        while (i<5){
//        System.out.println(i);
//        i++;}

           
//              Write a program that prompts the user to input a positive integer.




        //     Write a program that types first 30 consecutive odd integers
        //      It should then print the multiplication table of that number.

//        int localTotal = 1;
//        for (int i = 1; i <= 59; i += 2)
//          localTotal = localTotal*i;
//        System.out.println(localTotal);
        int m = 10;

        int n = 2;

        int sum = 0;



        while(m > n) {

            m--;

            n = n + 2;

            sum = sum + m + n;


        }

        System.out.println(sum);

    }}

