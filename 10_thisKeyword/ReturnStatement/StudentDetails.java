class StudentDetails {

    StudentDetails name() {
        System.out.println("Name: Kajal");
        return this;
    }

    StudentDetails course() {
        System.out.println("Course: BCA");
        return this;
    }

    StudentDetails college() {
        System.out.println("College: Goel Institute");
        return this;
    }

    public static void main(String[] args) {

        StudentDetails obj = new StudentDetails();

        obj.name().course().college();
    }
}