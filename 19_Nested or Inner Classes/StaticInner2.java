public class StaticInner2 {

    static int number = 100;

    static class Inner {
        static void display() {
            System.out.println("Number: " + number);
        }
    }

    public static void main(String[] args) {

        StaticInner2.Inner.display();
    }
}