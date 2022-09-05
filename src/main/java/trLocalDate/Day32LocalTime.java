package trLocalDate;

import java.time.LocalTime;

public class Day32LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);

        //bir islemin ne kadar surede bittigini b ulmak icin;
        // islemden once ve sonra birer time objesi olusturup aradaki farki hesdaplaybiliriz

        int sayi=0;
        for (int i =0; i<10000; i++){
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("Islem " + (nano1+nano2) + "saniyede bitti");

        //ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));


        //istersek zone id kullanarak istenen bolgenin saati icin obje olusturma

    }
}
