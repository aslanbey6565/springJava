package trVarargs;

public class Varargs01 {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "Aliye";
        String str3 = "veli";

        enUzunKelime(str1, str2, str3);

    }

    private static void enUzunKelime(String... str) {
        String enuzunStr="";

        for (String each: str) {
            if (each.length()>enuzunStr.length()){
                enuzunStr=each;
                            }
        }
        System.out.println("En uzun kelime : "+ enuzunStr);
    }
}
