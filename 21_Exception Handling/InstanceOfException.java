
public class InstanceOfException {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } 
        catch (Exception e) {

            if (e instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception occurred");
            } else {
                System.out.println("Some other exception occurred");
            }
        }
    }
}