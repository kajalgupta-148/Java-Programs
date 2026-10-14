

import java.io.FileInputStream;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("student.txt");

            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e);

        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                System.out.println("\nFile closed.");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}