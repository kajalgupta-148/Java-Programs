class School {

    void teachStudents() {
        System.out.println("School provides education.");
    }

    void conductExam() {
        System.out.println("School conducts examination.");
    }
}

class Teacher {

    public static void main(String[] args) {

        School obj = new School();

        obj.teachStudents();
        obj.conductExam();
    }
}