class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Student Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Kajal");
        Student s3 = new Student("Kajal", 21);
    }
}