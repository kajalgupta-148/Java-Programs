class Employee {

    void display() {
        System.out.println("Reference ID of this: " + this);
    }

    public static void main(String[] args) {

        Employee obj = new Employee();

        System.out.println("Reference ID of object: " + obj);

        obj.display();
    }
}