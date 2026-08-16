class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    Student getData() {
        return this;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student obj = new Student("Kajal");

        Student result = obj.getData();

        result.display();
    }
}