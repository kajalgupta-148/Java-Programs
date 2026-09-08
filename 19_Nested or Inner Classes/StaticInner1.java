public class StaticInner1 {

    private static int pinCode = 201038;

    static class Inner {
        void getPinCode() {
            System.out.println("Pin Code: " + pinCode);
        }
    }

    public static void main(String[] args) {

        StaticInner1.Inner obj = new StaticInner1.Inner();

        obj.getPinCode();
    }
}