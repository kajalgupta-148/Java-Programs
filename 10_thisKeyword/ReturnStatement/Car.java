class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    Car getCar() {
        return this;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {

        Car obj = new Car("Toyota");

        Car result = obj.getCar();

        result.display();
    }
}