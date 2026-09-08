interface Animal {
    void sound();
}

public class AnonymousInner1 {

    public static void main(String[] args) {

        Animal obj = new Animal() {

            @Override
            public void sound() {
                System.out.println("Dog barks.");
            }
        };

        obj.sound();
    }
}