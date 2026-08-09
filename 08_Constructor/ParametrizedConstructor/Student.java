class Student {

    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kajal");
        s1.display();
    }
}