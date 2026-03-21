package Day6_DatesAndTimes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //LocalDate, LocalTime, LocalDateTime, UTC timestamp

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        Instant instant = Instant.now();
//
//
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
//        System.out.println(instant);

        // custom format
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//
//        System.out.println(newDateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2018, 7, 24, 12, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 7, 24, 12, 30);

        if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        } else if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }
    }


}
