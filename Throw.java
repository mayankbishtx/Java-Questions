import java.io.FileReader;
import java.io.IOException;

public class Throw {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        System.out.println("File opened...");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or could not be read.");
        }
    }
}