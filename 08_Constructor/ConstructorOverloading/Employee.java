class Employee {

    Employee() {
        System.out.println("Employee Details");
    }

    Employee(String name) {
        System.out.println("Employee Name: " + name);
    }

    Employee(String name, double salary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Rahul", 50000);
    }
}