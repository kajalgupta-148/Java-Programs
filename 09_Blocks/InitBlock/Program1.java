class Program1 {

    String name;
    int age;
    int marks;

    {
        System.out.println("Student Object is being initialized...");
        System.out.println("Initialization Block Executed");
    }

    Program1(String studentName, int studentAge, int studentMarks) {
        name = studentName;
        age = studentAge;
        marks = studentMarks;
    }

    void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {

        Program1 student1 = new Program1("Rahul", 20, 78);
        Program1 student2 = new Program1("Priya", 21, 35);

        student1.displayDetails();
        student2.displayDetails();
    }
}