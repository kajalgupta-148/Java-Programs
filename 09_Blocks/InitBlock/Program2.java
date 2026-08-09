class Program2 {

    String name;
    double basicSalary;
    double hra;
    double da;
    double totalSalary;

    {
        System.out.println("Initialization Block Executed");
    }

    Program2(String employeeName, double salary) {
        name = employeeName;
        basicSalary = salary;

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        totalSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        System.out.println("\n----- Employee Salary -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Total Salary  : " + totalSalary);
    }

    public static void main(String[] args) {

        Program2 employee1 = new Program2("Amit", 30000);
        Program2 employee2 = new Program2("Neha", 40000);

        employee1.displaySalary();
        employee2.displaySalary();
    }
}