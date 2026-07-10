package DateTimeAPIEx;

import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        //past one hour time
        LocalTime pastOneHr = now.minusHours(1);
        System.out.println(pastOneHr);

        //custom time
        LocalTime customeTime = LocalTime.of(12, 12, 12);
        System.out.println(customeTime);

        //Parse Time
        String time = "15:00:02";
        LocalTime parsedTime = LocalTime.parse(time);
        System.out.println(parsedTime);

    }
}
