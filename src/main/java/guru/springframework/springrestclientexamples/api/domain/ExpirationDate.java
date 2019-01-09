package guru.springframework.springrestclientexamples.api.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpirationDate {

    private LocalDate date;
    private String timezoneType;
    private String timezone;
}
