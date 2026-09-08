public class NonStaticInner {

    private int pinCode = 201038;

    class Inner {
        void getPinCode() {
            System.out.println("Pin Code: " + pinCode);
        }
    }

    public static void main(String[] args) {

        NonStaticInner outer = new NonStaticInner();

        NonStaticInner.Inner obj = outer.new Inner();

        obj.getPinCode();
    }
}