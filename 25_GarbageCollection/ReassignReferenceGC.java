class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ReassignReferenceGC {
    public static void main(String[] args) {
        Student s = new Student("Aman");
        System.out.println(s.name);

        s = new Student("Riya");

        System.out.println(s.name);
        System.gc();
    }
}