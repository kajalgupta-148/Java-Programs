
public class NullPointerException {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        } 
        catch (java.lang.NullPointerException e) {
            System.out.println("String is null");
        }
    }
}