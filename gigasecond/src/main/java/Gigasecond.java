import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Gigasecond {

    private LocalDateTime gigaDate;

    public Gigasecond(final LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    public Gigasecond(final LocalDateTime birthDate) {
        this.gigaDate = birthDate.plus(1_000_000_000, SECONDS);
    }

    public LocalDateTime getDate() {
        return gigaDate;
    }
}
