import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        String data = "I love my India";

        StringTokenizer st = new StringTokenizer(data);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}