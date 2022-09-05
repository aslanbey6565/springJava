package trEncapsulationn;

public class C03 {

    private int sayi;
    private String str;


    public void setStr(String str) {
        this.str = str;
    }

    public int getSayi() {
        return sayi;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }
}
