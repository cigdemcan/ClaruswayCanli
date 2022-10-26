package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();//sistemde bugununt TARİHİNİ AATAMA YAPAR
        System.out.println("bugun = " + bugun);
        System.out.println(bugun.getYear());
        System.out.println(bugun.getMonthValue());
        System.out.println(bugun.getMonth());
        System.out.println(bugun.getDayOfYear());
        System.out.println(bugun.getDayOfMonth());
        System.out.println(bugun.getDayOfWeek());

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);
        //verilen bir tarihin öncesine ve sonrasına gitmek..
        System.out.println(date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println( bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));

    }
}
