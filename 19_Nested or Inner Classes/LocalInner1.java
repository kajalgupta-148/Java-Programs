public class LocalInner1 {

    void display() {

        class Inner {
            void show() {
                System.out.println("This is a Local Inner Class.");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {

        LocalInner1 outer = new LocalInner1();

        outer.display();
    }
}