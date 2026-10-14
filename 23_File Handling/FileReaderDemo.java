
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("output.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}