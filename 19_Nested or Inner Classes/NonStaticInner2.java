public class NonStaticInner2 {

    private String name = "Kajal";

    class Inner {
        void display() {
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {

        NonStaticInner2 outer = new NonStaticInner2();

        NonStaticInner2.Inner obj = outer.new Inner();

        obj.display();
    }
}