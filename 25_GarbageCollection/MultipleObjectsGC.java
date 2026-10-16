class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class MultipleObjectsGC {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman");
        Employee e2 = new Employee("Riya");
        Employee e3 = new Employee("Kajal");

        System.out.println(e1.name);
        System.out.println(e2.name);
        System.out.println(e3.name);

        e1 = null;
        e2 = null;
        e3 = null;

        System.gc();

        System.out.println("GC requested for eligible objects");
    }
}