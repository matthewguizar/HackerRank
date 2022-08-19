import java.time.LocalDate;

public class Day {

    public static String getDay(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
    
}
