package DateTimeAPIEx;

import java.time.Duration;
import java.time.Instant;

public class DurationEx {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(start);
        int sum = 0;
        for(int i = 0; i < 10000; i++){
            sum += i;
        }
        Instant end = Instant.now();
        System.out.println(end);
        Duration between = Duration.between(start, end);
        System.out.println(between);
    }
}
