import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        FileSaver fileSaver = new FileSaver();
        fileSaver.saveFile(fileReader.readFile("input.txt"));
    }
}
