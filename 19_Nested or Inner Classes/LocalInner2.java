public class LocalInner2 {

    void display() {

        int number = 50;

        class Inner {
            void show() {
                System.out.println("Number: " + number);
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {

        LocalInner2 outer = new LocalInner2();

        outer.display();
    }
}