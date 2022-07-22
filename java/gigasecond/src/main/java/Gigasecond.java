import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    int value = 1000000000;
    private int second =value%60;
    value = value/60;
    public Gigasecond(LocalDate moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public Gigasecond(LocalDateTime moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public LocalDateTime getDateTime() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
