public class StringBuilderReverse {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Programming");

        System.out.println("Original: " + sb);

        sb.reverse();

        System.out.println("Reverse: " + sb);
    }
}