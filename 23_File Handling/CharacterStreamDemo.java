
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("character.txt");

            fw.write("Java Character Stream");

            fw.close();

            System.out.println("Characters written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}