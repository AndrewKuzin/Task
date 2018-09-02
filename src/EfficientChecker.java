import java.time.Duration;
import java.util.List;

public class EfficientChecker {
    public void checkEfficient(List<TimeTable> timeTables) {
        int i = 0;
        while (i < timeTables.size() - 1) {
            Duration pathTime = Duration.between(timeTables.get(i).getDepartureTime(), timeTables.get(i).getArrivalTime());
            if (pathTime.compareTo(Duration.parse("PT1H")) > 0) {
                timeTables.remove(i);
            } else if (timeTables.get(i + 1).getDepartureTime().equals(timeTables.get(i).getDepartureTime())) {
                if (timeTables.get(i + 1).getArrivalTime().compareTo(timeTables.get(i).getArrivalTime()) < 0) ;
                timeTables.remove(i);
            } else if (!(timeTables.get(i + 1).getArrivalTime().compareTo(timeTables.get(i).getArrivalTime()) > 0)) {
                timeTables.remove(i);
            } else i++;
        }
    }
}
