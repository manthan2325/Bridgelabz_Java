/*
 * Problem 1 - Time Zones and ZonedDateTime
 *
 * Program to display the current time in different time zones:
 * GMT - Greenwich Mean Time
 * IST - Indian Standard Time
 * PST - Pacific Standard Time
 *
 * The program:
 * 1. Gets the current date and time.
 * 2. Uses ZoneId to specify different time zones.
 * 3. Uses ZonedDateTime to display the current time in
 *    GMT, IST and PST.
 *
 * Hint =>
 * 1. Use ZonedDateTime to work with date and time.
 * 2. Use ZoneId to specify the required time zones.
 * 3. Use the current time using ZonedDateTime.now().
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {

    public static void main(String[] args) {

        // Get current time in GMT
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneId.of("GMT"));

        // Get current time in IST
        ZonedDateTime istTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Get current time in PST
        ZonedDateTime pstTime =
                ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display the times
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}