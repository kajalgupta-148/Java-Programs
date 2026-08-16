class Car {

    void show() {
        System.out.println("Reference ID of this: " + this);
    }

    public static void main(String[] args) {

        Car obj = new Car();

        System.out.println("Reference ID of object: " + obj);

        obj.show();
    }
}