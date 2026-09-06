interface Printable {

    void print();
}

interface Showable {

    void show();
}

class Demo implements Printable, Showable {

    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.print();
        obj.show();
    }
}