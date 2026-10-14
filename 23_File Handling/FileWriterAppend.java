
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppend {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt", true);

            fw.write("\nThis is additional information.");

            fw.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}