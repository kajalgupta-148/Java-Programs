

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                    new FileOutputStream("output.txt", true);

            String data = "\nThis line is appended.";
            fos.write(data.getBytes());

            fos.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}