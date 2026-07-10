package DateTimeAPIEx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterEx {
    public static void main(String[] args) {
        String date = "10/07/2026";
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.parse(date,formatDate);
        System.out.println(today);
    }
}
