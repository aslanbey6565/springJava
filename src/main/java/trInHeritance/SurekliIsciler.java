package trInHeritance;

public class SurekliIsciler extends Isci2{

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


        SurekliIsciler suris = new SurekliIsciler();
        suris.persNo=4562;
        suris.isim="aliveli";
        suris.soyisim=";akjdbf";
        suris.saatucreti=12;
        suris.maas=suris.maasHesapla();
        System.out.println(suris);

    }
}
