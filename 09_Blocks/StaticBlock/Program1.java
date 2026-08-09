class Program1 {

    static String collegeName;
    static String university;
    static String location;

    static {
        collegeName = "Goel Institute";
        university = "University of Lucknow";
        location = "Lucknow";
        
        System.out.println("Static Block Executed");
        System.out.println("College Information Loaded");
    }

    public static void main(String[] args) {

        System.out.println("\n----- College Details -----");
        System.out.println("College    : " + collegeName);
        System.out.println("University : " + university);
        System.out.println("Location   : " + location);
    }
}