import java.time.LocalTime;

public class TimeTable {
    public String company;
    public LocalTime departureTime;
    public LocalTime arrivalTime;

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getCompany() {
        return company;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
