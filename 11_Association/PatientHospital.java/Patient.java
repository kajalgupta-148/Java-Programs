class Hospital {

    void treatment() {
        System.out.println("Hospital provides treatment.");
    }

    void emergencyService() {
        System.out.println("Hospital provides emergency service.");
    }
}

class Patient {

    public static void main(String[] args) {

        Hospital obj = new Hospital();

        obj.treatment();
        obj.emergencyService();
    }
}