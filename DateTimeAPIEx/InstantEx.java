package DateTimeAPIEx;

import java.time.Instant;

public class InstantEx {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); //2026-07-10T06:52:42.949480800Z
        //Instant = an exact moment on the global timeline (UTC).

//        Notice the Z at the end.
//
//        Z means UTC (Zero Offset).
//
//                If someone in India and someone in Mexico call:
//
//        Instant.now();
//
//        at the exact same moment, both get the same value.
//
//        India
//        Instant : 2026-07-10T07:25:31Z
//
//        Mexico
//        Instant : 2026-07-10T07:25:31Z
    }
}
