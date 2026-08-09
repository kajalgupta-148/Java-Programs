class HospitalPatient {

    String name;
    int age;

    HospitalPatient(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Patient Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        HospitalPatient p1 = new HospitalPatient("Kajal", 21);
        p1.display();
    }
}