package edu.wgu.d387_sample_code.controller;



import edu.wgu.d387_sample_code.Internationalization.TimeConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeConversionController {

    //When someone accesses /time in a web browser, it triggers the convertTime method.
    @GetMapping("/time")

    //takes a timeZone parameter from the request query, indicating the time zone to which you want to convert the time.
    public ResponseEntity<Map<String, String>> convertTime(@RequestParam String timeZone) {

        LocalDateTime currentTime = LocalDateTime.now();

        ZonedDateTime convertedTime = TimeConversion.convertToTimeZone(ZonedDateTime.of(currentTime, ZoneId.systemDefault()), timeZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = convertedTime.format(formatter);


        Map<String, String> response = new HashMap<>();
        response.put("timeZone", timeZone);
        response.put("convertedTime", formattedTime);

        return ResponseEntity.ok(response);
    }
    private String formatTime(ZonedDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return time.format(formatter);
    }
}