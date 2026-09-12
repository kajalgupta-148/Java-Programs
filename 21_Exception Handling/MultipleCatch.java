
public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int[] data = {10, 20, 30};

            int a = 10;
            int b = 0;

            System.out.println(a / b);
            System.out.println(data[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}