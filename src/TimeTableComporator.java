import java.util.Comparator;

public class TimeTableComporator implements Comparator<TimeTable> {

    @Override
    public int compare(TimeTable o1, TimeTable o2) {

        if (o1.getDepartureTime().compareTo(o2.getDepartureTime()) > 0) return 1;
        if (o1.getDepartureTime().compareTo(o2.getDepartureTime()) < 0) return -1;
        else {
            if (o1.getArrivalTime().compareTo(o2.getArrivalTime()) > 0) return -1;
            if (o1.getArrivalTime().compareTo(o2.getArrivalTime()) < 0) return 1;
            else {
                if (o1.getCompany().equals("Posh")) return 1;
                if (o1.getCompany().equals("Grotty")) return -1;
            }
        }
        return 0;
    }
}
