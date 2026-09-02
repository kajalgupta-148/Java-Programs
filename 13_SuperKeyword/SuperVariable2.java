class Employee {

    int salary = 20000;
}

class Manager extends Employee {

    int salary = 50000;

    void displaySalary() {
        System.out.println("Manager salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
    }
}

public class SuperVariable2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }
}