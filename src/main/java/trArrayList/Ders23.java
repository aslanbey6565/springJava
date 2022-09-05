
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

//class MultiDimensionalArrays {
//    public static void main(String[] args) {


//        // Sum of arrays elements
//        int arr[][] = {{3, 1, 7}, {6, 10, 2}};
//        System.out.println(arr[0][2]);
//
//        int sum=0;
//
//        for(int i=0; i< arr.length; i++){
//
//            for(int j=0; j<arr[i].length; j++){
//             sum+=arr[i][j];
//        }
//
//    }
//        System.out.println(sum);//29

        // 24 students in every 8 class
//
//        int arr[] [] =new int[8][24];
//
//        // 24 students - 8 class - 5 school
//
//        int arr2[][][]= new int[5][8][24];
//
//        // 3 class 24 students - 2 class 22 studens
//
//        int class24[][] = new int[3][24];
//        int class22[][] = new int[2][22];


//        Scanner scan=new Scanner (System.in);
//        System.out.println("Please enter array elements");
//
//        int uzun=scan.nextInt();
//        int arr[] =new int[uzun];
//
//        for(int i=0; i<uzun; i++){
//            System.out.println(" Enter " + (i+1) + ". enter ");
//            arr[i]=scan.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));


        ///how to add elements into current array


//       // 1. way
//
//        int arr[]={3,5,7};
//        //arr[3]=8;//you cant add new elements like this
//
//        arr=new int[4];// [0, 0, 0, 0]
//        System.out.println(Arrays.toString(arr));
//
//        int arrNew[]= new int[5];
//        System.out.println(Arrays.toString(arrNew));//[0, 0, 0, 0, 0]
//
//        arrNew [0]=2;
//        arrNew[3]=5;
//        arr=arrNew;
//
//        System.out.println(Arrays.toString(arr));//[2, 0, 0, 5, 0]
//
//
//        // 2. way
//
//        int arrNeww[]={1,2,3,4,5};
//        arr=arrNeww;
//        System.out.println(Arrays.toString(arr));


        // Kullanicidan cumle isteyin ve cumledeki kelime sayisini yazdirin
//        Scanner scan=new Scanner (System.in);
//        System.out.println("Enter a statement");
//        String statement= scan.nextLine();
//
//
//        String arr[]=statement.split(" ");
//
//        System.out.println("Number of word : " + arr.length);



        /// Asagidaki multi dimensional arrayin ic arraylerindeki son elemanlarin car[imini yazdirin
        // { {1,2,3},  {4,5}, {6} }

//        int arr[][]= { {1,2,3},  {4,5}, {6,} };
//        int multiply=1;
//
//        for (int i=0; i< arr.length; i++){
//
//                multiply*=arr[i][arr[i].length-1];
//
//
//
//}
//        System.out.println("carpim: " + multiply);
