class Program5 {

    static String transportDepartment = "Uttar Pradesh RTO";
    static int vehicleCount = 0;

    String ownerName;
    String vehicleNumber;
    String vehicleType;

    Program5(String name, String number, String type) {

        ownerName = name;
        vehicleNumber = number;
        vehicleType = type;

        vehicleCount++;
    }

    void displayVehicle() {

        System.out.println("\n----- Vehicle Details -----");
        System.out.println("Department     : " + transportDepartment);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }

    static void displayVehicleCount() {

        System.out.println("\nTotal Registered Vehicles = "
                + vehicleCount);
    }

    public static void main(String[] args) {

        Program5 vehicle1 =
                new Program5("Rahul", "UP32AB1234", "Car");

        Program5 vehicle2 =
                new Program5("Priya", "UP32CD5678", "Scooter");

        Program5 vehicle3 =
                new Program5("Amit", "UP32EF9012", "Bike");

        vehicle1.displayVehicle();
        vehicle2.displayVehicle();
        vehicle3.displayVehicle();

        displayVehicleCount();
    }
}