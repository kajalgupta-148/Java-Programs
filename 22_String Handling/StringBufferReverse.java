public class StringBufferReverse {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original: " + sb);

        sb.reverse();

        System.out.println("Reverse: " + sb);
    }
}