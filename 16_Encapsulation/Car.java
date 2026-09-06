class Car {

    private String model;
    private int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {

        Car obj = new Car();

        obj.setModel("BMW");
        obj.setSpeed(200);

        System.out.println("Model = " + obj.getModel());
        System.out.println("Speed = " + obj.getSpeed() + " km/h");
    }
}