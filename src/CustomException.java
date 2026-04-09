import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
