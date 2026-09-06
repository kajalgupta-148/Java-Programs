class Emp {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Emp obj = new Emp();

        obj.setId(101);
        obj.setName("Kajal");
        obj.setSalary(30000);

        System.out.println("ID = " + obj.getId());
        System.out.println("Name = " + obj.getName());
        System.out.println("Salary = " + obj.getSalary());
    }
}