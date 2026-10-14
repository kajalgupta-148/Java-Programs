

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}