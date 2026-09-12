public class StringValueOf {

    public static void main(String[] args) {

        int number = 100;

        String str = String.valueOf(number);

        System.out.println(str);
        System.out.println(str.getClass().getName());
    }
}