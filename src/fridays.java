import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class fridays {
    public static void main(String[] args) {
       LocalDateTime nextFriday = LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
       LocalDateTime lastFriday = LocalDateTime.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
       DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        String formattednextFriday = formatter.format(nextFriday);
        String formattedlastFriday = formatter.format(lastFriday);
        System.out.println("next friday will be on " + formattednextFriday);
        System.out.println("last friday was on " + formattedlastFriday);
    }
}
