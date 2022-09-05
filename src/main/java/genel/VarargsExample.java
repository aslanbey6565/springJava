package genel;

import jdk.swing.interop.SwingInterOpUtils;

public class VarargsExample {

    public static void main(String[] args) {

        System.out.println(add(10,15,20,30));

    }

    public static int add(int...b){
        int sum=0;
        for (int w : b){
            sum= sum +w;

        }
        return sum;



    }


}
