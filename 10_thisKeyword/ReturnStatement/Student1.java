class Student1 {

    Student1 first() {
        System.out.println("First method");
        return this;
    }

    Student1 second() {
        System.out.println("Second method");
        return this;
    }

    Student1 third() {
        System.out.println("Third method");
        return this;
    }

    public static void main(String[] args) {

        Student1 obj = new Student1();

        obj.first().second().third();
    }
}