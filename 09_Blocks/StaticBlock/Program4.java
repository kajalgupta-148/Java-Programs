class Program4 {

    static String name;
    static int age;
    static double percentage;

    static {
        name = "Kajal";
        System.out.println("First Static Block");
        System.out.println("Name initialized");
    }

    static {
        age = 21;
        System.out.println("Second Static Block");
        System.out.println("Age initialized");
    }

    static {
        percentage = 78.5;
        System.out.println("Third Static Block");
        System.out.println("Percentage initialized");
    }

    public static void main(String[] args) {

        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
    }
}