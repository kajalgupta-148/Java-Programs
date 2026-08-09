class Program3 {

    static double calculateHRA(double salary) {
        return salary * 0.20;
    }

    static double calculateDA(double salary) {
        return salary * 0.10;
    }

    static double calculateGrossSalary(double salary) {
        double hra = calculateHRA(salary);
        double da = calculateDA(salary);

        return salary + hra + da;
    }

    static void displaySalary(String name, double salary) {

        double hra = calculateHRA(salary);
        double da = calculateDA(salary);
        double grossSalary = calculateGrossSalary(salary);

        System.out.println("\n----- Employee Salary -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + salary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }

    public static void main(String[] args) {

        displaySalary("Rahul", 30000);
        displaySalary("Priya", 40000);
    }
}