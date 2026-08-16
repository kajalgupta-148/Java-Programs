class College {

    void provideEducation() {
        System.out.println("College provides education.");
    }

    void provideLibrary() {
        System.out.println("College provides library facility.");
    }
}

class Student {

    public static void main(String[] args) {

        College obj = new College();

        obj.provideEducation();
        obj.provideLibrary();
    }
}