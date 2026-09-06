class Student {

    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.setRollNo(1);
        obj.setName("Kajal");
        obj.setMarks(85.5);

        System.out.println("Roll No = " + obj.getRollNo());
        System.out.println("Name = " + obj.getName());
        System.out.println("Marks = " + obj.getMarks());
    }
}