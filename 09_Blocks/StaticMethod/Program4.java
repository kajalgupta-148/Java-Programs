class Program4 {

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static int square(int number) {
        return number * number;
    }

    static int cube(int number) {
        return number * number * number;
    }

    static void displayNumber(int number) {

        System.out.println("\n----- Number Analysis -----");
        System.out.println("Number     : " + number);

        if (isEven(number)) {
            System.out.println("Type       : Even");
        } else {
            System.out.println("Type       : Odd");
        }

        if (isPositive(number)) {
            System.out.println("Sign       : Positive");
        } else {
            System.out.println("Sign       : Negative");
        }

        System.out.println("Square     : " + square(number));
        System.out.println("Cube       : " + cube(number));
    }

    public static void main(String[] args) {

        displayNumber(8);
        displayNumber(-5);
    }
}