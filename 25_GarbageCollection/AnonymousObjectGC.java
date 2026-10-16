class Demo {
    Demo() {
        System.out.println("Object created");
    }
}

public class AnonymousObjectGC {
    public static void main(String[] args) {
        new Demo();

        System.gc();

        System.out.println("GC requested");
    }
}