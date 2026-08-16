class Student {

    void show() {
        System.out.println("Reference ID of this: " + this);
    }

    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println("Reference ID of object: " + obj);

        obj.show();
    }
}