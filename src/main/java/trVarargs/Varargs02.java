package trVarargs;

public class Varargs02 {
    public static void main(String[] args) {
    int sayi=5;
    String str1="Elif";
    String str2="Olivia";

    carpim(sayi,str1,str2);
    //Bir methodda var args disinda bir method kullanilacaksa
        // once digermethodlar yazilir daha sonra varargs en sonayazilir
        // Bu sebeple bir methodda birden fazla varargs olmaz

}

    private static void carpim(int sayi, String... str) {

        String enuzunStr = "";

        for (String each: str) {
            if (each.length()>enuzunStr.length()) {
                enuzunStr = each;
            }
            System.out.println("Istenen deger : " + sayi*enuzunStr.length());
        }
    }
}