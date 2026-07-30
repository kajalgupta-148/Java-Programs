class Student1 {
    String name;
    int marks;

    void display() {
        System.out.println(name + " : " + marks);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.name = "Aman";
        s1.marks = 90;

        s2.name = "Kajal";
        s2.marks = 95;

        s1.display();
        s2.display();
    }
}