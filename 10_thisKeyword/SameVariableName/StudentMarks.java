class StudentMarks {

    int roll;
    String name;
    int marks;

    StudentMarks(int roll, String name, int marks) {

        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        StudentMarks obj = new StudentMarks(101, "Kajal", 85);

        obj.display();
    }
}