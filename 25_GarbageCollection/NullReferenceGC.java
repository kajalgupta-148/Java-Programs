class Student {
    String name = "Kajal";
}

public class NullReferenceGC {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);

        s = null; // Object becomes eligible for GC

        System.gc();

        System.out.println("GC requested");
    }
}