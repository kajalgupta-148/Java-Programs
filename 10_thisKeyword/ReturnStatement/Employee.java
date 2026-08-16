class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    Employee getObject() {
        return this;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {

        Employee obj = new Employee("Rahul");

        Employee result = obj.getObject();

        result.display();
    }
}