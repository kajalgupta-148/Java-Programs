class Employee1 {

    Employee1 login() {
        System.out.println("Employee Login");
        return this;
    }

    Employee1 work() {
        System.out.println("Employee is working");
        return this;
    }

    Employee1 logout() {
        System.out.println("Employee Logout");
        return this;
    }

    public static void main(String[] args) {

        Employee1 obj = new Employee1();

        obj.login().work().logout();
    }
}