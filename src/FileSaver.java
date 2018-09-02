import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileSaver {
    public void saveFile(List<TimeTable> timeTables) throws IOException {
        FileWriter writer = null;
        writer = new FileWriter("output.txt");
        int i = 0;
        while (i < timeTables.size()) {
            if (timeTables.get(i).getCompany().equals("Posh")) {
                String name = timeTables.get(i).getCompany();
                String departureTime = String.valueOf(timeTables.get(i).getDepartureTime());
                String arrivalTime = String.valueOf(timeTables.get(i).getArrivalTime());
                writer.write(name + " " + departureTime + " " + arrivalTime + System.getProperty("line.separator"));
                timeTables.remove(timeTables.get(i));
            } else i++;
        }
        writer.write(System.getProperty("line.separator"));
        for (TimeTable timeTable : timeTables) {
            String name = timeTable.getCompany();
            String departureTime = String.valueOf(timeTable.getDepartureTime());
            String arrivalTime = String.valueOf(timeTable.getArrivalTime());
            writer.write(name + " " + departureTime + " " + arrivalTime + System.getProperty("line.separator"));
        }
        writer.close();
    }
}
