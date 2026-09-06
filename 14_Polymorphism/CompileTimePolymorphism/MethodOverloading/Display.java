class Display {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Display obj = new Display();

        obj.show(10);
        obj.show("Kajal");
    }
}