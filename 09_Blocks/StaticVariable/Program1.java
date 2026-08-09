class Program1 {

    static String collegeName = "Goel Institute";
    static String university = "University of Lucknow";
    static String city = "Lucknow";

    String studentName;
    int rollNumber;
    double percentage;

    Program1(String name, int roll, double marks) {
        studentName = name;
        rollNumber = roll;
        percentage = marks;
    }

    void displayStudent() {

        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Percentage   : " + percentage);
        System.out.println("College      : " + collegeName);
        System.out.println("University   : " + university);
        System.out.println("City         : " + city);
    }

    public static void main(String[] args) {

        Program1 student1 = new Program1("Rahul", 101, 78.5);
        Program1 student2 = new Program1("Priya", 102, 85.2);

        student1.displayStudent();
        student2.displayStudent();
    }
}