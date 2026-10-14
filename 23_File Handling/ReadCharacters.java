
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacters {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("student.txt");

            char[] data = new char[50];

            int count = fr.read(data);

            System.out.println("Characters read: " + count);
            System.out.println(data);

            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}