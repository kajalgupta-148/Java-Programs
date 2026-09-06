class Bird {

    void fly() {
        System.out.println("Bird is flying");
    }
}

class Eagle extends Bird {

    void fly() {
        System.out.println("Eagle flies high");
    }

    public static void main(String[] args) {

        Bird obj = new Eagle();

        obj.fly();
    }
}