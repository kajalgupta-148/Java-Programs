class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee obj = new Employee(101, "Rahul", 50000);

        obj.display();
    }
}