package jsr310;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@RestController
public class DateController {

    @RequestMapping("/localDate")
    public LocalDate todayLocalDate() {
        return LocalDate.now();
    }

    @RequestMapping("/offsetDateTime")
    public OffsetDateTime todayOffsetDateTime() {
        return OffsetDateTime.now();
    }
}
