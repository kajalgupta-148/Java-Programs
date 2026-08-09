class Program1 {

    static int calculateTotal(int maths, int science, int computer) {
        return maths + science + computer;
    }

    static double calculatePercentage(int total) {
        return total / 3.0;
    }

    static void displayResult(String name, int total, double percentage) {
        System.out.println("\n----- Student Result -----");
        System.out.println("Name       : " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage : " + percentage);

        if (percentage >= 40) {
            System.out.println("Result     : Pass");
        } else {
            System.out.println("Result     : Fail");
        }
    }

    public static void main(String[] args) {

        int total = calculateTotal(85, 78, 92);
        double percentage = calculatePercentage(total);

        displayResult("Kajal", total, percentage);
    }
}