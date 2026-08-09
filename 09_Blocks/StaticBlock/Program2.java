class Program2 {

    static String companyName;
    static String companyLocation;
    static int employeeCount;

    static {
        companyName = "ABC Technologies";
        companyLocation = "Bangalore";
        employeeCount = 500;

        System.out.println("Company Information Initialized");
    }

    void displayEmployeeInfo(String name, int salary) {

        System.out.println("\n----- Employee -----");
        System.out.println("Name          : " + name);
        System.out.println("Salary        : " + salary);
        System.out.println("Company       : " + companyName);
        System.out.println("Company City  : " + companyLocation);
        System.out.println("Employees     : " + employeeCount);
    }

    public static void main(String[] args) {

        Program2 employee1 = new Program2();
        Program2 employee2 = new Program2();

        employee1.displayEmployeeInfo("Rahul", 35000);
        employee2.displayEmployeeInfo("Priya", 42000);
    }
}