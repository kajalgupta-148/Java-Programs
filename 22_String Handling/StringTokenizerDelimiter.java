import java.util.StringTokenizer;

public class StringTokenizerDelimiter {

    public static void main(String[] args) {

        String data = "Java,Python,C++";

        StringTokenizer st = new StringTokenizer(data, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}