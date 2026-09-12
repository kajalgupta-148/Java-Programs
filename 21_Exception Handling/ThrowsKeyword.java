
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

    static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

        System.out.println("File opened successfully");

        file.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("File could not be opened");
        }
    }
}