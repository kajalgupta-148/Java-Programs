package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");

            String data = "Hello, Java File Handling!";
            fos.write(data.getBytes());

            fos.close();

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}