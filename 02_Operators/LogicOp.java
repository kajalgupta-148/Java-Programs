public class LogicOp {
    public static void main(String[] args) {

        int age = 22;
        boolean hasID = true;

        System.out.println("AND (&&): " + (age >= 18 && hasID));
        System.out.println("OR (||): " + (age < 18 || hasID));
        System.out.println("NOT (!): " + (!hasID));
    }
}