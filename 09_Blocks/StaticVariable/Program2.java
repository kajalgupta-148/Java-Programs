class Program2 {

    static int employeeCount = 0;

    String name;
    int salary;

    Program2(String employeeName, int employeeSalary) {

        name = employeeName;
        salary = employeeSalary;

        employeeCount++;
    }

    void displayEmployee() {

        System.out.println("\n----- Employee Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    static void displayEmployeeCount() {

        System.out.println("\nTotal Employees = " + employeeCount);
    }

    public static void main(String[] args) {

        Program2 employee1 = new Program2("Rahul", 30000);
        Program2 employee2 = new Program2("Priya", 35000);
        Program2 employee3 = new Program2("Amit", 40000);
        Program2 employee4 = new Program2("Neha", 45000);

        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
        employee4.displayEmployee();

        displayEmployeeCount();
    }
}