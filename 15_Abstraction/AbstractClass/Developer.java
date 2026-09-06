abstract class Employee {

    abstract void work();

    void company() {
        System.out.println("Employee works in a company");
    }
}

class Developer extends Employee {

    void work() {
        System.out.println("Developer writes code");
    }

    public static void main(String[] args) {
        Developer obj = new Developer();

        obj.work();
        obj.company();
    }
}