class Student {

    int roll;
    String name;
    String course;

    Student(int roll, String name, String course) {

        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student obj = new Student(101, "Kajal", "BCA");

        obj.display();
    }
}
