package DateTimeAPIEx;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(2002, 03, 11);
        Period age = Period.between(today, bday);
        System.out.println(age); // P-24Y-3M-30D

    }
}
