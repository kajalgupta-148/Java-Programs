import java.util.ArrayList;

class StudentRecord {
    private int rollNo;
    private String name;
    private double marks;

    public StudentRecord(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class ArrayListStudentRecords {
    public static void main(String[] args) {
        ArrayList<StudentRecord> students = new ArrayList<>();

        students.add(new StudentRecord(1, "Aman", 85.5));
        students.add(new StudentRecord(2, "Kajal", 91.0));
        students.add(new StudentRecord(3, "Neha", 88.0));

        for (StudentRecord student : students) {
            System.out.println(student);
        }
    }
}
