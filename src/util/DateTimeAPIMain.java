package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeAPIMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println(today);         // 2025-04-15
        System.out.println(now);           // 10:30:25.123
        System.out.println(nowDateTime);   // 2025-04-15T10:30:25.123


        LocalDate nextWeek = LocalDate.now().plusWeeks(1);
        LocalTime oneHourLater = LocalTime.now().plusHours(1);

        System.out.println(nextWeek);        // 2025-04-22
        System.out.println(oneHourLater);    // 11:30:00


    }
}
