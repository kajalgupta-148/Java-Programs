interface Bird {

    void fly();

    default void color() {
        System.out.println("Blue color");
    }
}

class Eagle implements Bird {

    public void fly() {
        System.out.println("Eagle is flying");
    }

    public static void main(String[] args) {
        Eagle obj = new Eagle();

        obj.fly();
        obj.color();
    }
}