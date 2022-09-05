package trLocalDate;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day32DataTimeFormatter {

    public static void main(String[] args) {
        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/M/YYYY");
        System.out.println(formatter.format(tarihSaat)); //29/6/2022
        DateTimeFormatter formatter1 =DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter1.format(tarihSaat)); //29/06/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("hh : mm:ss a");//02 : 35:34 p.m.
        System.out.println(formatterSaat.format(tarihSaat));

    }
}
