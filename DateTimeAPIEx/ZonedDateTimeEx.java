package DateTimeAPIEx;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeEx {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // 2026-07-10T11:55:10.010638100+05:30[Asia/Calcutta]
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        System.out.println(availableZoneIds); // we will get all zone ids like this [Asia/Calcutta]

        //to know the time of mexico
        ZonedDateTime mexicoDateTime = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
        System.out.println(mexicoDateTime);

    }
}
