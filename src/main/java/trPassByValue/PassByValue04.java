package trPassByValue;

import java.util.Arrays;

public class PassByValue04 {
    public static void main(String[] args) {

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("Method call sonrasi:" +Arrays.toString(arr))                                                                                                                                                                                                                   ;

    }

    private static void arrDegistir(int[] arr) {
                arr[0]=5;
                arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }
}
