
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("byte.txt");

            fos.write(65);
            fos.write(66);
            fos.write(67);

            fos.close();

            System.out.println("Bytes written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}