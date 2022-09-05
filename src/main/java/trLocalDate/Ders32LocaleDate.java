package trLocalDate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Ders32LocaleDate {

    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); //Objenin olusturuldugu tarihi trhye atar

        LocalDate dogumTrh=LocalDate.of(1989,07,01);

        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());

        //bir tarihten istedigimiz tarihe kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(20).minusDays(3));
        System.out.println(trh.plusMonths(5).plusDays(15));

        // istenen ulkenin tarihini getirme
        LocalDate trhZone=LocalDate.now(ZoneId.of("Turkey"));
        System.out.println(trhZone);
        //is ile baslayan methodlar boolean sonuc getirir
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(trh.isAfter(dogumTrh));

    }
}
