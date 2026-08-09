class Program5 {

    static int maths;
    static int science;
    static int computer;
    static int total;
    static double percentage;

    static {
        maths = 85;
        science = 78;
        computer = 92;

        total = maths + science + computer;
        percentage = total / 3.0;

        System.out.println("Marks Initialized Using Static Block");
    }

    static void displayResult() {

        System.out.println("\n----- Examination Result -----");
        System.out.println("Maths    : " + maths);
        System.out.println("Science  : " + science);
        System.out.println("Computer : " + computer);
        System.out.println("Total    : " + total);
        System.out.println("Percentage : " + percentage);

        if (percentage >= 40) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }

    public static void main(String[] args) {

        displayResult();
    }
}