class CollegeStudent {

    String name;
    String course;

    CollegeStudent(String n, String c) {
        name = n;
        course = c;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Course : " + course);
    }

    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent("Kajal", "BCA");
        s1.display();
    }
}