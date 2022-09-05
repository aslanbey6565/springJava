package trLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Day32IkiTariohArasiniBulma {

    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1989,07,01);
        System.out.println(Period.between(dogumgunu,bugun));//P32Y11M28D
        System.out.println(Period.between(dogumgunu,bugun).getYears());//32

    }
}
