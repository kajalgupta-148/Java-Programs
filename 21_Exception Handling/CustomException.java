
class AgeException extends Exception {

    AgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } 
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}