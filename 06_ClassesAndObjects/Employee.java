class Employee {
    int id;
    String name;
    double salary;

    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 101;
        e.name = "Rahul";
        e.salary = 35000;

        e.showDetails();
    }
}