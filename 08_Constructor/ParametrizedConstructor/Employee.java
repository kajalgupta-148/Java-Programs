class Employee {

    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 50000);
        e1.display();
    }
}