import java.util.LinkedList;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class LinkedListStudentRecords {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student(1, "Aman"));
        students.add(new Student(2, "Kajal"));
        students.add(new Student(3, "Neha"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
