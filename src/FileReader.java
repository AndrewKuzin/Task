import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileReader {

    public List<TimeTable> readFile(String path) {
        List<TimeTable> timeTables = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                TimeTable timeTable = new TimeTable();
                timeTable.setCompany(strLine.substring(0, strLine.indexOf(" ")));
                timeTable.setDepartureTime(LocalTime.parse(strLine.substring(strLine.indexOf(" ") + 1, strLine.lastIndexOf(" "))));
                timeTable.setArrivalTime(LocalTime.parse(strLine.substring(strLine.lastIndexOf(" ") + 1)));
                timeTables.add(timeTable);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        Collections.sort(timeTables, new TimeTableComporator());
        EfficientChecker ec = new EfficientChecker();
        ec.checkEfficient(timeTables);


        return timeTables;
    }
}
