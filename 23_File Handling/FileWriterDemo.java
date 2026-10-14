
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Name: Kajal");
            fw.write("\nCourse: MCA");
            fw.write("\nSubject: Java");

            fw.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}