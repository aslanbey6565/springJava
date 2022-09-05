package trLocalDate;

import java.time.LocalDateTime;

public class Day32LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(2).plusHours(8).plusMinutes(7));
    }
}
