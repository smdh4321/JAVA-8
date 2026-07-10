package DateTimeAPIEx;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int dayOfYear = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(dayOfYear);
        System.out.println("----------------------------------------");
        //custom date
        LocalDate broBday = LocalDate.of(1997, 12, 12);
        System.out.println(broBday);
        System.out.println(broBday.getYear());

        //how to get yesterday
        LocalDate yesterday = now.minusDays(1);
        System.out.println(yesterday);

        //past months date
        LocalDate pastMonths = now.minusMonths(2);
        System.out.println(pastMonths);

    }
}
