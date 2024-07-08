package edu.wgu.d387_sample_code.Internationalization;

import java.time.ZonedDateTime;
import java.time.ZoneId;


public class TimeConversion {
    public static ZonedDateTime convertToTimeZone(ZonedDateTime sourceDateTime, String timeZoneId) {
        ZoneId targetZone = ZoneId.of(timeZoneId);
        return sourceDateTime.withZoneSameInstant(targetZone);

    }
}
