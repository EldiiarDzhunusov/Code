package PS12;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Gigasecond {

    private LocalDateTime localDateTime;


    public Gigasecond(LocalDate localDate) {
        this.localDateTime = localDate.atStartOfDay();
    }
    public Gigasecond(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    public LocalDateTime getDateTime(){



        return localDateTime.plusSeconds(1_000_000_000);
    }
}
