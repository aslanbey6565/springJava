package trVarargs;

public class VarArgs {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplam(sayi1,sayi2);
        toplam(sayi1,sayi2,sayi3);
        toplam(sayi1,sayi2,sayi3,sayi4);
        toplam(sayi1,sayi2,sayi3,sayi4,sayi5);
    }
    private static void toplam(int... sayi1) {

            int topla = 0;
        for (int each: sayi1) {
            topla += each;
        }
            System.out.println(topla);
}}
