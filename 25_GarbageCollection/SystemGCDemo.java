class MyObject {
    int value = 100;
}

public class SystemGCDemo {
    public static void main(String[] args) {
        MyObject obj = new MyObject();

        System.out.println(obj.value);

        obj = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }
}